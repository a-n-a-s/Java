package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int random_number = rand.nextInt(3);
        //System.out.println(comp);
        System.out.println("******Rock Paper And Scissors*******");
        System.out.println("Enter Rock(r) Paper(p) Scissors(s) : ");
        String user = sc.next();
        user = user.toLowerCase();
        // 0 = 'r'
        // 1 = 'p'
        // 2 = 's
        int user_num = 0;
        if (user.startsWith("r")){
            user_num = 0;
        }
        else if (user.startsWith("p")){
            user_num = 1;
        }
        else if (user.startsWith("s")){
            user_num = 2;
        }

        if (random_number == 0 && user_num == 2){
            System.out.println("You lost ! Computer has chosen : Rock and you chosen : Scissors");
        }
        else if (random_number == 0 && user_num == 1){
            System.out.println("You Won ! Computer has chosen : Rock and you chosen : Paper ");

        }
        else if (random_number == 2 && user_num == 0) {
            System.out.println("You Won ! Computer has chosen : Scissors and you chosen : Rock");
        }
        else if (random_number == 2 && user_num == 1){
            System.out.println("You lost ! Computer has chosen : Scissors and you chosen : Paper");
        }
        else if (random_number == 1 && user_num == 0){
            System.out.println("You lost ! Computer has chosen : Paper and you chosen : Rock");
        }
        else if (random_number == 1 && user_num == 2){
            System.out.println("You Won ! Computer has chosen : Paper and you chosen : Scissors");
        }
        else {
            System.out.println("Draw ! you both have chosen same thing");
        }



    }







    }
