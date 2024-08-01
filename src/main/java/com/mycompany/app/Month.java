package com.mycompany.app;

import java.util.Scanner;

public class Month {

    public static void selectMonth () {
        Scanner sc = new Scanner(System.in);
        Integer monthNumber;
        System.out.println("Select a number of month");
        monthNumber = sc.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + monthNumber);
        }
    }
}


/*
do {
        System.out.println("Select number of month");
        monthNumber = sc.nextInt();
        if (monthNumber <= 0 || monthNumber > 12) {
        System.out.println("Number incorrect" + "\nTry Again!");
        }
        } while (monthNumber <= 0 || monthNumber > 12);*/
