package com.company;

public class starPatternUsingRecursion {
    static void starPattern(int n){
        if (n>0){
            starPattern(n-1);
            for (int i = 0; i <n ; i++) {
                System.out.print("*");


            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        starPattern(4);

    }
}
