package Calender;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input = getInput();
        LocalDate startDate = LocalDate.of(input, Month.JANUARY, 1);

        Calender calender = new Calender();
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