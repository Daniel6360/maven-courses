package ro.itschool.curs17.enumerations;

import javax.sound.midi.Soundbank;

public class UseEnums {
    public static void main(String[] args) {
        DayName dayName=new DayName();
        System.out.println(dayName.sayMyName(Days.FRIDAY));

        System.out.println(Days.FRIDAY +"day in week is " + Days.FRIDAY.getNumber());

        System.out.println(dayName.sayMyName(Days.FRIDAY));

        for(Days day:Days.values()){
            System.out.println(day.getName());
        }
        System.out.println(Days.valueOf("MONDAY").getName());

        for(Days day: Days.values()){
            if(day.bestDay()){
                System.out.println(day);
            }
        }

    }

}
