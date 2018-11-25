package OldCalender;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

// Eerst wat ik heb gedaan is zorgen dat ik een goeie start datum heb 
        LocalDate startDate = LocalDate.of(2018, Month.JANUARY, 1);
        // System.out.println(startDate.lengthOfMonth());

//        for (int i = 1; i <= startDate.lengthOfMonth(); i++) {
//            System.out.println(i);
//        }


         //maanden en dagen
        for (int i = 0; i < 12; i++) {
            System.out.println(startDate.plusMonths(i).getMonth());

        }
        // loop door week
//        for (int i = 0; i < 7; i++) {
//            //System.out.println(startDate.plusMonths(i).getMonth());
//            System.out.println(startDate.getDayOfWeek().plus(i));
//        }


// loop door dagen van de week afgekort
                for (int i = 0; i < 7; i++) {
           // System.out.println(startDate.plusMonths(i).getMonth());

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
                    System.out.print(formatter.format(startDate.getDayOfWeek().plus(i))+" ");
                  //  System.out.print(startDate.getDayOfWeek().plus(i)+" ");
                }
        System.out.println();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
//        System.out.println(formatter.format(startDate));

//        // maanden en
//        for (int i = 0; i < 12; i++) {
//            System.out.println(startDate.plusMonths(i).getMonth());
//            // korte dagen
//            for (int j = 0; j < 7; j++) {
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
//                    System.out.print(formatter.format(startDate.getDayOfWeek().plus(j))+" ");
//                }
//            System.out.println();
//                // hier dagen doen
//            for (int k = 1; k <= startDate.plusMonths(i).lengthOfMonth(); k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
        // maanden en
//        for (int i = 0; i < 12; i++) {
//            System.out.println(startDate.plusMonths(i).getMonth());
//            // korte dagen
//            for (int j = 0; j < 7; j++) {
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
//                    System.out.print(formatter.format(startDate.getDayOfWeek().plus(j))+" ");
//                }
//            System.out.println();
//                // hier dagen doen
//            for (int k = 1; k <= startDate.plusMonths(i).lengthOfMonth(); k++) {
//
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
//        for (int k = 1; k <= startDate.lengthOfMonth(); k++) {

        for (int k = 1; k <= startDate.lengthOfMonth(); k++) {

            //System.out.print(k);
        }
// dagen van de maanden uitgeprint
        int getal = 1;
        int[][] twoD = new int[6][7];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                // print dagen van de maand uit
                if (getal <= startDate.lengthOfMonth()) {
                    twoD[i][j] = getal++;

                }
                //print 2 dim array uit
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
        System.out.println(startDate.getDayOfWeek());
    }
}