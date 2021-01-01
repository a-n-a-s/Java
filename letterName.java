package com.company;

import java.util.Scanner;

public class letterName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String letter = "Dear <name> , Thanks A Lot.";
        System.out.println(letter.replace("<name>",name));

    }
}
