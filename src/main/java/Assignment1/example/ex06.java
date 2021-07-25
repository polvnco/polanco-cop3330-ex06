/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;

import java.util.Calendar;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        Scanner currentAge = new Scanner(System.in);
        String age = currentAge.nextLine();
        int x = Integer.parseInt(age);

        System.out.print("At what age would you like to retire? ");
        Scanner futureAge = new Scanner(System.in);
        String retirement = futureAge.nextLine();
        int y = Integer.parseInt(retirement);

        y = y - x;

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retirementYear = year + y;

        System.out.println("You have " + y + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + retirementYear + ".");

    }
}
