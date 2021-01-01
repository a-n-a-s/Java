package com.company;

import java.util.Scanner;

public class intergerIsthereOrNot {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int array [] = new int[] { 56 ,89 , 54 , 65 , 698 ,561};
        boolean isThere = false;
        System.out.println("Enter Any Integer : ");
        int n = sc.nextInt();
        for(int element : array){
            if (element == n){
                isThere = true;
                break;
            }

        }
        if (isThere){
            System.out.println("This number is there in this array");
        }
        else {
            System.out.println("This number is not there in the array");
        }
    }
}
