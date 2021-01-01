package com.company;

import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number : ");
        int num = sc.nextInt();
        /*
        if (num == 1){
            System.out.println("Monday");
        }
        else if (num == 2){
            System.out.println("Tuesday");
        }
        else if (num == 3){
            System.out.println("Wednesday");
        }
        else if (num == 4){
            System.out.println("Thursday");
        }
        else if (num == 5){
            System.out.println("Friday");
        }
        else if (num == 6){
            System.out.println("Saturday");
        }
        else if (num == 7){
            System.out.println("Sunday");
    } */
    switch (num){
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Please Enter A number from 1 - 7");
    }

}

}

