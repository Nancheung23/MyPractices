import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class e03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input searching month with regex yyyy-M: (start since 2022-02)");
        LocalDate restDate = LocalDate.of(2022, 2, 3);

        String userStr = scanner.next() + "-01";
        LocalDate inputDate = LocalDate.parse(userStr);
        inputDate = inputDate.plusMonths(1).minusDays(1);
        System.out.println(inputDate);

        List<Day> days = new ArrayList<>();
        while (restDate.isBefore(inputDate)) {
            Day day = new Day(restDate);
            days.add(day);
            restDate = restDate.plusDays(1);
        }
        int length = days.size();
        for (int i = 0; i < length; i++) {
            if (i % 3 == 0) {
                days.get(i).setFlag(true);
            } else {
                days.get(i).setFlag(false);
            }
        }

        Map<Day, String> holidayList = new HashMap<>();
        for (Day day : days) {
            if (day.getFlag()) {
                holidayList.put(day, day.getDate().getDayOfWeek().toString());
            }
        }
        holidayList.forEach((k, v) -> {
            if (v.equals("SATURDAY") || v.equals("SUNDAY")) {
                System.out.println(k + " : " + v);
            }
        });
    }
}

class Day {
    private LocalDate date;
    private Boolean flag;

    public Day(LocalDate date, Boolean flag) {
        this.date = date;
        this.flag = flag;
    }

    public Day() {
    }

    public Day(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return date.toString();
    }
}