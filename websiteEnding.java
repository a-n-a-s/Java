package com.company;

import java.util.Scanner;

public class websiteEnding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url :");
        String url = sc.next();
        if (url.endsWith(".org")){
            System.out.println("It is an Organization");
        }
        else if (url.endsWith(".com")){
            System.out.println("It is a Commercial website");
        }
        else if (url.endsWith(".in")){
            System.out.println("It is an Indian website");
        }

    }
}
