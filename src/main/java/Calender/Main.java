package Calender;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Het jaar op halen die de gebruiker heeft getypt en in de var input zetten
        int input = getInput();

        //begin datum van het jaar dat zal worden uitgeprint
        LocalDate startDate = LocalDate.of(input, Month.JANUARY, 1);

        // object calender hierin zit de methode om een calender uit te printen
        Calender calender = new Calender();
        //Hier roep de methode om calender uit te printen met de startdatum die van de var startdate
        calender.printCalender(startDate);
    }

    public static int getInput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Here under you can fill a year in to get a calender of it");
            System.out.print("Fill Year: ");
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please Fill in Year, like 2008 next time");
        }
        return 2018;
    }

}