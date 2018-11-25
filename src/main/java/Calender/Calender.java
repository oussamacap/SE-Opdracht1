package Calender;

import java.time.LocalDate;

public class Calender {
    Week week = new Week();
    Day days = new Day();


    public  void printCalender(LocalDate startDate) {
        for (int i = 0; i < 12; i++) {
             System.out.println(startDate.plusMonths(i).getMonth());
            week.printShortWeekdays(startDate, i);
            days.printDaysOfTheMonth(startDate, i);
        }


    }
}