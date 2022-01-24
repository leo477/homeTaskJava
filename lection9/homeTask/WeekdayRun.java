package com.itea.dimka.lection9.homeTask;

public class WeekdayRun {
    public static void main(String[] args) {

        for(Enum e : Weekday.values()){
            Weekday weekday= Weekday.valueOf(e.toString());
            System.out.println(weekday + " is holiday: " + weekday.isHoliday() +
                    " is weekday: " + weekday.isWeekDay());
        }
    }
}
