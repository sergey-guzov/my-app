package com.mycompany.app;

import java.util.Scanner;

public class ReverseOutput {
    public static int[] reverseArray() {
        Scanner sc = new Scanner(System.in);
        Integer arrayLength;
        do {
            System.out.println("Enter array length");
            arrayLength = sc.nextInt();
            if (arrayLength <= 0) {
                System.out.println("Incorrect array length " + arrayLength );
            }
        } while (arrayLength <= 0);
        int[] array = new int[arrayLength];
        for (int i = 0; i < (arrayLength); i++) {
            System.out.println("Enter " + i + " element of array");
            int nextElement = sc.nextInt();
            array[i]= nextElement;
        }
        for(int i = (arrayLength-1); i >= 0; i--) {
            System.out.println("[" + array[i] + "]");
        }
        sc.close();
        return(array);
    }
}
