package com.company;

public class classRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.width = 4;
        rect.sides();
        System.out.println("The area of rect is "+rect.area());
        System.out.println("The perimeter of rect is "+rect.perimeter());

    }
}
class Rectangle{
    int length;
    int width;
    public void sides() {
        System.out.println("length =  " + length + " , " + "width  =  "+ width);

    }
    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2 * (length + width);
    }

}
