package Calender;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// class week print dagen van de week uit
// het word 7 keer geloopt om elke dag van de wee uit te printen
// met DateTimeFormatter wordt de week afgekort en met Locale.getDefault() zorg ik er voor dat de benaming engels is

public class Week {
    public  void printShortWeekdays(LocalDate startDate, int i) {
        for (int j = 0; j < 7; j++) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE", Locale.getDefault());
            System.out.print(formatter.format(startDate.plusMonths(i).getDayOfWeek().plus(j)) + " ");
            formatter.format(startDate.plusMonths(i).getDayOfWeek().plus(j));
        }
        System.out.println("");
    }
}