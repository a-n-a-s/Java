package com.company;

import java.util.Scanner;

public class passOrFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths Marks : ");
        float maths = sc.nextFloat();
        System.out.println("Enter Social Marks : ");
        float social = sc.nextFloat();
        System.out.println("Enter Science Marks : ");
        float science = sc.nextFloat();
        float total = ((maths + science + social)/300)*100;
        if (total >= 40 && maths >=33 && science >= 33 && social >= 33){
            System.out.println("Congrats! Your are Passed");
        }
        else {
            System.out.println("Oops! Your Are Failed");
        }
    }
}
