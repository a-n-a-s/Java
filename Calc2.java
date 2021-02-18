package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, divided, multiplied, added, subtracted;
        char operator;

        System.out.print("Value A: ");
        num1 = input.nextDouble();
        if (num1 >= 100000){
            try {
                throw new Morethan1Lakh();

            }
            catch (InputMismatchException e){
                System.out.println(e.toString());
                //System.out.println(e.getMessage());
                System.exit(0);

            }
        }

        System.out.print("Operator (/, *, +, -): ");
        operator = input.next().charAt(0);

        System.out.print("Value B: ");
        num2 = input.nextDouble();
        if (num2 >= 100000){
            try {
                throw new Morethan1Lakh();

            }
            catch (InputMismatchException e){
                System.out.println(e.toString());
                //System.out.println(e.getMessage());
                System.exit(0);

            }
        }

        divided = num1 / num2;
        multiplied = num1 * num2;
        added = num1 + num2;
        subtracted = num1 - num2;

        switch (operator)
        {
            case '/':
            {
                if(num2 == 0){
                    System.out.println("Cannot Divide By zero");
                }
                else {
                    System.out.println("RESULT  : " + divided);
                }
            }
            case '*':
            {
                if (num1 >= 7000 && num2 >= 7000)
                    try{
                        throw new MaxMultiplier();
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                else{
                    System.out.println("RESULT : " + multiplied);

                }
            }
            case '+':
            {
                System.out.println("Result: " + added);
                break;
            }
            case '-':
            {
                System.out.println("Result: " + subtracted);
                break;
            }
            default:
            {
                System.out.println("Invalid operator!");
                break;
            }
        }
    }




    }







class InvalidInput extends InputMismatchException {
    @Override
    public String getMessage() {
        return "Invalid Operator is Inputted  !";
    }
    @Override
    public String toString() {
        return "Invalid Operator is Inputted  !";
    }
}
class MaxMultiplier extends Exception{
    @Override
    public String getMessage() {
        return "Don't allow any multiplication input to be greater than 7000";
    }
    @Override
    public String toString() {
        return " Don't allow any multiplication input to be greater than 7000";
    }

}
class Morethan1Lakh extends InputMismatchException{
    @Override
    public String getMessage() {
        return "THIS CALCULATOR CAN ONLY OPERATE NUMBERS LESS THAN 100000";
    }

    @Override
    public String toString() {
        return "THIS CALCULATOR CAN ONLY OPERATE NUMBERS LESS THAN 100000";
    }

}
