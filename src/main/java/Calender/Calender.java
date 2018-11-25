package Calender;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// Deze klasse loopt 12 keer en print de naam van een maand uit te printe
// hieronder objecten gemaakt van de klasse week en dag
// de methode's om week uit printen en dagen van de maand worden opgeroepen in de loop


public class Calender {

    Week week = new Week();
    Day days = new Day();

    public  void printCalender(LocalDate startDate) {
        for (int i = 0; i < 12; i++) {
             System.out.println(startDate.plusMonths(i).getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
            week.printShortWeekdays(startDate, i);
            days.printDaysOfTheMonth(startDate, i);
        }
    }
}