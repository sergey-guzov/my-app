package com.mycompany.app;

public class SumAndMultiplication {
    public static void sum (int[] massive) {
        int arraySum = 0;
        int arrayMultiplication = 1;
        for (int i = 0; i < massive.length; i++) {
            arraySum += massive[i];
            arrayMultiplication *= massive[i];
        }
        System.out.println("Sum = " + arraySum + "\nMultiplication = " + arrayMultiplication );

    }
}
