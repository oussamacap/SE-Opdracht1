package Calender;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Week {
    public  void printShortWeekdays(LocalDate startDate, int i) {
        for (int j = 0; j < 7; j++) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
            System.out.print(formatter.format(startDate.plusMonths(i).getDayOfWeek().plus(j)) + " ");
            formatter.format(startDate.plusMonths(i).getDayOfWeek().plus(j));
        }
        System.out.println("");
    }
}