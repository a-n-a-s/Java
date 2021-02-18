package com.company;

import java.util.Scanner;

public class errorsAndExceptions {
    public static void main(String[] args) {
        //Problem 1
        //int a = 7 -> Syntax error
        // int f = 900 - 789 -> Logical
        // System.out.println(6/0); ->

        // Problem 2
        try {
            System.out.println(6/0);
        }
        catch (ArithmeticException a){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException i){
            System.out.println("HeHe");
        }
        // Problem 3
        boolean flag= true;
        int i = 0;
        int [] marks= {32,65,84,62,21,10};
        Scanner sc = new Scanner(System.in);

        while (flag && i<5){

            try {
                System.out.println("Enter The Index :");
                int index = sc.nextInt();


                System.out.println("Marks[index] = " +  marks[index]);
                break;

            }
            catch (Exception e){
                System.out.println("Invalid");
                System.out.println(e);
                i++;

            }
            if (i>=5){
                System.out.println("Error");
            }
        }

    }

}
