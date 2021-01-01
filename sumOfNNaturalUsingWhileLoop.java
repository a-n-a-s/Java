package com.company;

public class sumOfNNaturalUsingWhileLoop {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;
        while (i < n){
            sum = sum + (2*i);
            i++;
        }
        System.out.println(sum);
    }
}
