package com.projectHospital.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate today;
    private boolean morning;
    private LocalTime mStart;
    private LocalTime mEnd;

    private int mTotalNumber;
    private int mAppointNumber;

    private boolean afternoon;
    private LocalTime aStart;
    private LocalTime aEnd;
    private int aTotalNumber;
    private int aAppointNumber;

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getmStart() {
        return mStart;
    }

    public void setmStart(LocalTime mStart) {
        this.mStart = mStart;
    }

    public LocalTime getmEnd() {
        return mEnd;
    }

    public void setmEnd(LocalTime mEnd) {
        this.mEnd = mEnd;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getaStart() {
        return aStart;
    }

    public void setaStart(LocalTime aStart) {
        this.aStart = aStart;
    }

    public LocalTime getaEnd() {
        return aEnd;
    }

    public void setaEnd(LocalTime aEnd) {
        this.aEnd = aEnd;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }
}
