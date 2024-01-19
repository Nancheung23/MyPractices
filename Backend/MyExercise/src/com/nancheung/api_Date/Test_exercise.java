package com.nancheung.api_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_exercise {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date startTime = dateFormat.parse("2023-11-11 0:0:0");
        Date endTime = dateFormat.parse("2023-11-11 0:10:0");
        Date submit1Time = dateFormat.parse("2023-11-11 0:01:18");
        Date submit2Time = dateFormat.parse("2023-11-11 0:10:51");

        printSubmissionStatus(startTime, endTime, submit1Time, "Submit1");
        printSubmissionStatus(startTime, endTime, submit2Time, "Submit2");
    }

    public static boolean checkSuccessful(Date startTime, Date endTime, Date submitTime) {
        return submitTime.after(startTime) && submitTime.before(endTime);
    }

    public static void printSubmissionStatus(Date startTime, Date endTime, Date submitTime, String submissionName) {
        if (checkSuccessful(startTime, endTime, submitTime)) {
            System.out.println(submissionName + " is in time of this event.");
        } else {
            System.out.println(submissionName + " is not in time of this event.");
        }
    }
}
