package com.mycompany.app;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void generateRandomNumber() {
        Scanner sc = new Scanner(System.in);
        Integer quantity;
        do {
            System.out.println("How many random numbers do you want to generate?");
            quantity = sc.nextInt();
            if (quantity <= 0) System.out.println("Incorrect quantity " + quantity + "\nTry again"  );
        } while (quantity <= 0);
        System.out.println(quantity);
        for( int i = 1; i <= quantity; i++ ) {
            Random r = new Random();
            System.out.println("Number " + i + ": " + r.nextInt() );
        }
        sc.close();
    }
}
