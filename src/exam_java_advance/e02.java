package com.nancheung.exam_java_advance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e02 {
    public static void main(String[] args) {
        String userStrs = "101:a:male:1990-01-01#102:b:female:1989-01-09#103:c:male:1999-09-09#104:d:male:1899-01-01#105:e:male:1900-01-01" + 
        "#106:a:female:1999-01-01#107:d:female:1999-01-01#108:a:female:2003-07-01#109:f:male:1900-01-01";
        String[] userStrsSlice = userStrs.split("#");
        List<User> users = new ArrayList<>();
        for (String user : userStrsSlice) {
            String[] tempArr = user.split(":");
            try {
                Long id = Long.valueOf(tempArr[0]);
                String name = tempArr[1];
                String gender = tempArr[2];
                LocalDate birthday = LocalDate.parse(tempArr[3], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                User userInfo = new User(id, name, gender, birthday);
                System.out.println(user.toString());
                users.add(userInfo);
            } catch (NumberFormatException e) {
                System.out.println("Can't transform id");
            } catch (DateTimeParseException e){
                System.out.println("Can't parse birthday");
            }
        }
        Map<String, Integer> nameMap = new HashMap<>();
        String[] arrName = new String[users.size()];
        for (int index = 0; index < arrName.length; index++) {
            arrName[index] = users.get(index).getName();
        }
        for(String name : arrName) {
            if (nameMap.containsKey(name)) {
                nameMap.put(name, nameMap.get(name) + 1);
            } else {
                nameMap.put(name, 1);
            }
        }
        System.out.println("Name Map: ");
        nameMap.forEach((key, value) -> {System.out.println(key + " : " + value);});
    }
}

/**
 * User
 */
class User { 
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthday;

    public User(Long id, String name, String gender, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name= " + name + ", gender=" + gender + ", birthday=" + birthday + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}