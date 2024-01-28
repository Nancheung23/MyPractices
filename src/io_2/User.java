package io_2;

import java.io.Serializable;

public class User implements Serializable{
    private String loginName;
    private String userName;
    private int age;
    // * add "transient" to remove attribute from serialiize list
    private transient String passWord;

    public User(String loginName, String userName, int age, String passWord) {
        this.loginName = loginName;
        this.userName = userName;
        this.age = age;
        this.passWord = passWord;
    }

    public User() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User [loginName=" + loginName + ", userName=" + userName + ", age=" + age + ", passWord=" + passWord
                + "]";
    }

}
