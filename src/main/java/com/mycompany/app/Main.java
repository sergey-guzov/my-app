package com.mycompany.app;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer taskNumber;
        do {
            System.out.println("Select a number of task you would like to launch");
            System.out.println("1. Hello, user!");
            System.out.println("2. Reverse array output");
            System.out.println("3. Random numbers");
            System.out.println("4. Sum/Multiplication of array elements");
            System.out.println("5. Select month");

            taskNumber = sc.nextInt();
            if (taskNumber <= 0 || taskNumber > 5) {
                System.out.println("Incorrect task number selected: " + taskNumber + "\nTry again!" );
            }
        } while (taskNumber <= 0 || taskNumber > 5);
        switch (taskNumber) {
            case 1:
                HelloUser.enterName();
                break;
            case 2:
                ReverseOutput.reverseArray();
                break;
            case 3:
                RandomNumbers.generateRandomNumber();
                break;
            case 4:
                SumAndMultiplication.sum(ReverseOutput.reverseArray());
                break;
            case 5:
                Month.selectMonth();
        }
        sc.close();
    }
}