package com.projectHospital.bean;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    private String doctorId;
    private String name;
    private String departmentName;
    private String gender;

    private int age;
    private String speciality;
    private LocalDate joinDate;
    private ArrayList<Schedule> schedules = new ArrayList<>();

//    public String getDoctorID() {
//        return doctorID;
//    }
//
//    public void setDoctorID(String doctorID) {
//        this.doctorID = doctorID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
}
