package com.company;

public class sumOfElementsOfArray {
    public static void main(String[] args) {
        float array [] = new float[]{7.5f , 95.2f , 96.5f , 14.7f , 65.5F};

        float sum = 0f;

        for (float v : array) {
            sum = sum + v;

        }
        System.out.println(sum);

    }
}
