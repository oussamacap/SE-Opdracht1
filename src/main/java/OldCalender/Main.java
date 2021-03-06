package OldCalender;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

// Eerst wat ik heb gedaan is zorgen dat ik een goeie start datum heb om vanuit daaruit te kunnen optellen
        //Ik heb het boek gelezen en op het gedeelte Localdate en dat hielp om de opdracht te maken
        LocalDate startDate = LocalDate.of(2018, Month.JANUARY, 1);

     // hiermee kon ik de lengte van een maand uitprinten dit kon ik goed gebruiken om alle dagen van een maand uit te printen
        System.out.println(startDate.lengthOfMonth());

        //daarna ehb ik gezocht hoe ik al dagen van een maand kan uit printen, hier heb ik een loop voor gebruikt
        for (int i = 1; i <= startDate.lengthOfMonth(); i++) {
            System.out.println(i);
        }


         //met deze loop ik door de maanden van het jaar en print ik ze ook
        for (int i = 0; i < 12; i++) {
            System.out.println(startDate.plusMonths(i).getMonth());

        }
        // loop door week
        for (int i = 0; i < 7; i++) {
            //System.out.println(startDate.plusMonths(i).getMonth());
            System.out.println(startDate.getDayOfWeek().plus(i));
        }


    // loop door dagen van de week afgekort naam
                for (int i = 0; i < 7; i++) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
                    System.out.print(formatter.format(startDate.getDayOfWeek().plus(i))+" ");
                }

//
//        // maanden uiprinten met daar onder de week
        for (int i = 0; i < 12; i++) {
            System.out.println(startDate.plusMonths(i).getMonth());
            // korte dagen
            for (int j = 0; j < 7; j++) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
                System.out.print(formatter.format(startDate.getDayOfWeek().plus(j)) + " ");
            }
            System.out.println();
        }

// dagen van de maand Jan uitgeprint met daarboven de weekdagen afgerkort
        // ik vond 2 dim array het lastigste van de opdracht
        int getal = 1;
        int[][] twoD = new int[6][7];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                // print dagen van de maand uit
                if (getal <= startDate.lengthOfMonth()) {
                    twoD[i][j] = getal++;

                }
                if (getal <= 10) {
                    System.out.print(" " + twoD[i][j] + " ");
                } else if (twoD[i][j] == 0) {
                    System.out.print("");
                } else {
                    System.out.print(twoD[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}