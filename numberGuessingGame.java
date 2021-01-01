package com.company;

import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

    public static void main(String[] args) {
        numberGame game = new numberGame();


        boolean b = false;
        while (!b){
            game.takeUserInput();
           b =  game.isCorrect();

        }


    }
}
class numberGame{

    public int randomly;
    public int noOfGuesses;
    public int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


    void Game(){
        Random rand = new Random();
        this.randomly = rand.nextInt(50);

    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess The Number : ");
        inputNumber = sc.nextInt();



    }
    boolean isCorrect(){
        noOfGuesses++;
        if (randomly == inputNumber){
            System.out.format("You Guessed It Right ! In %d and the num was %d",noOfGuesses,randomly);
            return true;
        }
        else if(inputNumber<randomly){
            System.out.println("Too low...");
        }
        else if(inputNumber>randomly){
            System.out.println("Too high...");
        }
        return false;
    }


}
