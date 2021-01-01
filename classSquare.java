package com.company;

public class classSquare {
    public static void main(String[] args) {
        Square square = new Square();
        square.side = 8;
        System.out.println("The side of the square is " + square.side());
        System.out.println("The area of the square  is " +square.area());
        System.out.println("The perimeter of the square is " + square.perimeter());

    }
}
class Square{
    int side;
    public int side(){
        return side;
    }
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return side*4;
    }
}
