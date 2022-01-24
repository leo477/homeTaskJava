package com.itea.dimka.lection9.homeTask;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isHoliday(){
        switch (this){
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

    public boolean isWeekDay(){
        if (isHoliday() != true){
            return true;
        } else{
            return false;
        }
    }
}
