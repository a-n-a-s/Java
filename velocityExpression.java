package com.company;

public class velocityExpression {
    public static void main(String[] args) {
        float v = 10;
        float u = 20;
        float a = 15;
        float velocity = ((v*v) - (u*u))/(2*a);
        System.out.println(velocity);
    }
}
