package olegChilikin.practice;

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JA 1 2018"));
    }

    public static boolean isDateOdd(String date) {

        //Разбиваем строку на 3(месяц, день, год);

        String [] dateArray = new String[date.length()];
        for (int i = 0; i < date.length(); i++) {
            dateArray[i] = "";
            dateArray[i] += date.charAt(i);
        }
        String month = "";
        String day = "";
        String year = "";
        int probel = 0;
        for (int i = 0; i < dateArray.length; i++) {
            if (probel == 0) {
                if (!dateArray[i].equals(" "))
                    month += dateArray[i];
                else {
                    ++probel;
                    ++i;
                }
            }
            if (probel == 1) {
                if (!dateArray[i].equals(" "))
                    day += dateArray[i];
                else{
                    ++probel;
                    ++i;
                }
            }
            if (probel == 2)
                if (!dateArray[i].equals(" "))
                    year += dateArray[i];
                else
                    break;
        }

        // переводим все значения в int;

        int dayInt = Integer.parseInt(day);
        int yearInt = Integer.parseInt(year);
        int monthInt = 0;
        switch (month.toLowerCase()) {
            case ("january"):
                monthInt = 1;
                break;
            case ("february"): //"FEBRUARY" || "February" ||
                monthInt = 2;
                break;
            case ("march"): //"MARCH" || "March" ||
                monthInt = 3;
                break;
            case ("april"): //"APRIL" || "April" ||
                monthInt = 4;
                break;
            case ("may"): //"MAY" || "May" ||
                monthInt = 5;
                break;
            case ("june"):
                monthInt = 6;
                break;
            case ("july"):
                monthInt = 7;
                break;
            case ("august"):
                monthInt = 8;
                break;
            case ("september"):
                monthInt = 9;
                break;
            case ("october"):
                monthInt = 10;
                break;
            case ("november"):
                monthInt = 11;
                break;
            case ("december"):
                monthInt = 12;
                break;
        }
        --monthInt;

        Date yearStartDate = new Date();
        yearStartDate.setSeconds(0);
        yearStartDate.setMinutes(0);
        yearStartDate.setHours(0);
        yearStartDate.setDate(1);
        yearStartDate.setMonth(0);
        yearStartDate.setYear(yearInt);

        Date userDate = new Date();
        userDate.setSeconds(0);
        userDate.setMinutes(0);
        userDate.setHours(0);
        userDate.setDate(dayInt);
        userDate.setMonth(monthInt);
        userDate.setYear(yearInt);

        long msTimeDistance = userDate.getTime() - yearStartDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        if (dayCount % 2 == 0)
            return true;
        else
            return false;
    }


}