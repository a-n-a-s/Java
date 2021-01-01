package com.company;
class Circle2{
    int radius;
    int pi = 3;

     Circle2(int radius) {
        this.radius = radius;
    }
    Circle2(){
        this.radius = 5;
    }
    public int area(){
         return this.pi * this.radius * this.radius;
    }
}
class Cylinder2 extends Circle2{
    int height;

    public Cylinder2(int radius, int height) {
        super(radius);
        this.height = height;
    }
    Cylinder2(){
        this.height = 7;
    }
    public int volume(){
        return this.pi * this.radius * this.radius * this.height;
    }

}
class  Rectangle2{
    int length;
    int width;

     Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }
    Rectangle2(){
         this.length = 3;
         this.width = 4;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
         return this.length * this.width;
    }
}
class Cuboid extends Rectangle2{
    int height;

     Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    Cuboid(){
         this.height = 7;
    }
    public int volume(){
         return this.length * this.width * this.height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
class Base{
    public Base() {
        System.out.println("I am base Constructor");
    }
}
class Derived extends Base{
    public Derived() {
        System.out.println("I am Derived Constructor");
    }
}
class Derived2 extends Derived{
    public Derived2() {
        System.out.println("I am Derived2 Constructor");
    }
}
public class inheritanceExercise {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();

    }
}
