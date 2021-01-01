package com.company;

public class sumOfNUsingRecursion {
    static int sumRec(int n ){
        if (n == 1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        sumRec(5);

    }
}
