package com.company;

import java.util.Scanner;

public class starPatternUsingWhile {
    public static void main(String[] args) {


        int n= 7;

        int i=n,j;
        while(i>0)
        {
            j=0;
            while(j++<i)
            {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}



