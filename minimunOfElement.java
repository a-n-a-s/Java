package com.company;

public class minimunOfElement {
    public static void main(String[] args) {
        int [] array = { 54 ,  45 ,36 };
        int min = -2147483648;
        for (int e : array){
            if (e > min){
                min = e;
            }

        }
        System.out.println(min);

    }

}
