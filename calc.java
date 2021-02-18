package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int a = sc.nextInt();
        if (a!=sc.nextInt()){
            try{
                throw new InvalidInput();

            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }

       if (a >= 100000 ){
            try {
                throw new Morethan1Lakh();
            }
            catch (InputMismatchException e){
                System.out.println(e.toString());
                //System.out.println(e.getMessage());
                System.exit(0);
            }
        }

        System.out.println("Enter The Operator  '+' , ' - ' , ' * ' and ' / '" );
        char op = sc.next().charAt(0);

        System.out.println("Enter The Second Number : ");
        int b = sc.nextInt();



        switch(op) {
            case '+' :

                System.out.println(a+b);
                break;
            case '-' :

                System.out.println(a-b);
                break;
            case '*' :


                break;
            case '/' :
                if (b == 0){try {

                    throw new Zero();
                }
                catch (ArithmeticException ae){
                    System.out.println("Cannot " + ae.getMessage());
                }}

                System.out.println(a/b);

                break;
            default :
                try {
                    throw new InvalidInput();
                }
                catch (Exception e ){
                    System.out.println(e.getMessage());
                }

        }
    }

}



class Zero extends ArithmeticException{


    @Override
    public String getMessage() {
        return super.getMessage() + "Cannot Divide By Zero";
    }

    @Override
    public String toString() {
        return super.toString() + "Cannot Divide By Zero";
    }
}


