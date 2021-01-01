package com.company;

import java.util.Scanner;

public class intOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text or number :");
        boolean a = sc.hasNextInt();
        System.out.println(a);
    }
}
