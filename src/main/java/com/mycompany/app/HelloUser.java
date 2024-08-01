package com.mycompany.app;

import java.util.Scanner;

public class HelloUser {
    public static void enterName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = sc.nextLine();
        System.out.println("Hello " + username);
        sc.close();

    }
}
