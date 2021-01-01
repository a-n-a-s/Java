package com.company;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("//////CGPA/////");
        System.out.println("Enter Your Maths Marks out of 100 : ");
        float a  = sc.nextInt();

        System.out.println("Enter Your English Marks out of 100 : ");
        float b  = sc.nextInt();


        System.out.println("Enter Your Hindi Marks out of 100 : ");
        float c  = sc.nextInt();


        System.out.println("Enter Your Computer Marks out of 100 : ");
        float d  = sc.nextInt();


        System.out.println("Enter Your Science Marks out of 100 : ");
        float f  = sc.nextInt();


        System.out.println("Enter Your Social Marks out of 100 : ");
        float g  = sc.nextInt();

        float cgpa = ((a/10)+(b/10)+(c/10)+(d/10)+(f/10)+(g/10))/6;
        System.out.println(cgpa);

    }
}
