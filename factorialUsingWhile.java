package com.company;

public class factorialUsingWhile {
    public static void main(String[] args) {
        int n = 5;
        int fac = 1;
        int i = 1;
        while (i <= n){
            fac*= i;
            i++;
        }
        System.out.println(fac);
    }
}
