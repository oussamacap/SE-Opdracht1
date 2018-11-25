package Calender;

import java.time.LocalDate;

// class day heeft de methode printDaysofTheMonths hier wordt door 2 dim array gezorgt dat de dagen onder weekbenaming goed komen te staan
// met een nested loop ik door de array vul ik de array var getal, die laat op tellen als de onder of gelijk is aan de maand
// met andere if zorg dat zowel de  kleine getallen (zoals 4,2) en grotere getalen (zoals 10,28) mooi onder elkaar komen

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
                    System.out.print(" " + twoD[k][z] + "  ");
                } else if (twoD[k][z] == 0) {
                    System.out.print("");
                } else {
                    System.out.print(twoD[k][z] + "  ");
                }
            }
            System.out.println();
        }
    }
}