package com.company;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        if (year%4 == 0){
            System.out.println("Its A Leap Year");
        }
        else{
            System.out.println("It is not A leap Year");
        }
    }
}
