package com.company;

public class averageOfNumbers {
    static  int average(int...arr){
        int sum = 0;
        for (int a: arr
             ) {
            sum += a;

        }

        return (sum)/ arr.length;


    }
    public static void main(String[] args) {
    int result = average(459 , 567 , 265 , 200);
        System.out.println(result);


    }
}
