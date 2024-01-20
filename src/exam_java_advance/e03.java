import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class e03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input searching month with regex yyyy-M: (start since 2022-02)");
        LocalDate restDate = LocalDate.of(2022, 2, 3);

        String userStr = scanner.next() + "-01";
        LocalDate inputDate = LocalDate.parse(userStr);
        LocalDate staticDate = LocalDate.parse(userStr);
        inputDate = inputDate.plusMonths(1).minusDays(1);
        // System.out.println(inputDate);

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
        // TreeMap compares keys to sort the order
        Map<Day, String> holidayList = new TreeMap<>((date1, date2) -> date1.getDate().compareTo(date2.getDate()));
        for (Day day : days) {
            if (day.getFlag()) {
                holidayList.put(day, day.getDate().getDayOfWeek().toString());
            }
        }
        System.out.println("Origin hashmap: ");
        holidayList.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Your holiday list (for weekend): ");
        holidayList.forEach((k, v) -> {
            if ((v.equals("SATURDAY") || v.equals("SUNDAY")) && k.getDate().isAfter(staticDate)) {
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