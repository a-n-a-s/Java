package com.company;

import java.util.Scanner;

public class KphToMph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many km you want to convert : ");
        float km = sc.nextFloat();
        float miles = (float) (km / 1.609);
        System.out.println(miles);
    }
}
