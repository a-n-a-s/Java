package com.company;

public class celsiusToFahrenheit {
    static float celsius(float n) {
        float fah = (n*9)/5.0f +32;
        return fah;
    }
    public static void main(String[] args) {
        float result = celsius(36);
        System.out.println(result);



    }
}
