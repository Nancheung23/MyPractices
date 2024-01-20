package com.projectHospital.frame;

import com.projectHospital.bean.Appointment;
import com.projectHospital.bean.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManager {
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while(true) {
            System.out.println("====== Welcome To Hospital Management System ======");
            System.out.println("1. Department Management -- Add Department");
            System.out.println("2. Department Management -- Delete Department");
            System.out.println("3. Department Management -- Modify Department");
            System.out.println("4. Doctor Management -- Add Doctor");
            System.out.println("5. Doctor Management -- Set Service Time");
            System.out.println("6. Doctor Management -- Check All Service Time");
            System.out.println("7. Doctor Management -- Make An Appointment");
            System.out.println("8. Search Doctor Status");
            System.out.println("Please Input Command: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case "1":
                    addDepartment();
                    break;
                case "3":
                    addDoctor();
                    break;
                case "5":
                    setDoctorJob();
                    break;
                default:
                    break;
            }
        }
    }

    private void setDoctorJob() {
    }

    private void addDoctor() {
    }

    private void addDepartment() {
    }
}
