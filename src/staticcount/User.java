package com.nancheung.staticcount;

public class User {
    private static int userNum;
    private String userName;
    private int userAge;

//    public User() {
//        // counting user numbers when generate new one
//        userNum++;
//        System.out.printf("new user added, total number: %d\n", userNum);
//    }

    public User(String userName, int userAge) {
        // counting user numbers when generate new one
        userNum++;
        System.out.printf("new user added, total number: %d\n", userNum);
        this.userName = userName;
        this.userAge = userAge;
    }

    public static int getUserNum() {
        return userNum;
    }

    public static void setUserNum(int userNum) {
        User.userNum = userNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
