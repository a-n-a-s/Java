package com.company;

import java.util.Scanner;

public class cbseBoardMarksCalculator {

    public static void main(String[] args) {
	// write your code here
        System.out.println("********CBSE MARKS CALCULATOR *************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths Marks out of 100: ");
        int a = sc.nextInt();
        System.out.println("Enter Science Marks out of 100: ");
        int b = sc.nextInt();
        System.out.println("Enter Social Marks out of 100: ");
        int c = sc.nextInt();
        System.out.println("Enter English Marks out of 100 : ");
        int d = sc.nextInt();
        System.out.println("Enter Hindi Marks out of 100 : ");
        int e = sc.nextInt();

        int percentage = (a + b + c + d + e)/5;
        System.out.println("Your Percentage is :");
        System.out.print(percentage);


    }
}
