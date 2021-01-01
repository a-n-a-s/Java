package com.company;

public class sumOfNUsingMethods {
    static void sum(int x ){
        int total = 0;
        for (int i = 0; i <= x  ; i++) {
            total = total + i;


        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        sum(5);

    }
}
