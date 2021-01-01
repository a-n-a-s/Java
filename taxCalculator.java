package com.company;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income : ");
        float income = sc.nextFloat();
        if (income < 250000){
            System.out.println("You Don't Have To Pay Any Tax");
        }
        else if (income >= 250000 && income <= 500000) {
            income = (income/100)*5;
            System.out.print("You Have to Pay :");
            System.out.print(income);

        }
        else if (income >= 500000 && income <= 1000000) {
            income = (income/100)*20;
            System.out.print("You Have to Pay :");
            System.out.print(income);

        }
        else {
            income = (income/100)*30;
            System.out.print("You Have to Pay :");
            System.out.print(income);

        }
    }
}
