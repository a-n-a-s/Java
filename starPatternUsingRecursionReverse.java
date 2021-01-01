package com.company;

public class starPatternUsingRecursionReverse {
    static void starPatternReverse(int n){
        if (n>0){
            starPatternReverse(n-1);
            for (int i = n; i >0 ; i--) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        starPatternReverse(4);

    }
}
