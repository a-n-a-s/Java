package com.company;

public class maximumOfElement {
    public static void main(String[] args) {
        int [] array = { 56 , 51 , 65 , 91 , 35};
        int max = 0;
        for (int e : array){
            if (e > max){
                max = e ;
            }


        }
        System.out.println(max);

    }
}
