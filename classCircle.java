package com.company;

public class classCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 10;
        circle.showRadius();
        System.out.println("The area of circle is "+circle.area());
        System.out.println("The perimeter of circle is "+circle.perimeter());
    }
}
class Circle{
    float radius;
    float pie = 3.14f;
    public void showRadius(){
        System.out.printf("The Radius is %f\n",radius);
    }
    public float area(){

        return  (pie * (radius * radius));
    }
    public float perimeter(){
        return (2*pie*radius);
    }
}
