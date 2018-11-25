package Calender;

import java.time.LocalDate;

public class Day {

    public void printDaysOfTheMonth(LocalDate startDate, int i) {
        int getal = 1;
        int[][] twoD = new int[6][7];
        for (int k = 0; k < twoD.length; k++) {
            for (int z = 0; z < twoD[k].length; z++) {
                // print dagen van de maand uit
                if (getal <= startDate.plusMonths(i).lengthOfMonth()) {
                    twoD[k][z] = getal++;
                }
                //print 2 dim array uit
                if (getal <= 10) {
                    System.out.print(" " + twoD[k][z] + " ");
                } else if (twoD[k][z] == 0) {
                    System.out.print("");
                } else {
                    System.out.print(twoD[k][z] + " ");
                }
            }
            System.out.println();
        }
    }
}