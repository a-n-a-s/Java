package com.company;

public class multiplicationTableUsingMethod {
    static void  table(int x ){
        int multiply = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d * %d = %d \n", x , i , x*i);
        }
    }
    public static void main(String[] args) {
        table(65);

    }
}
