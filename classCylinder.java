package com.company;

public class classCylinder {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(12,56);
       // myCylinder.setHeight(12);
        //myCylinder.setRadius(5);
        float h = myCylinder.getHeight();
        float r = myCylinder.getRadius();
        System.out.format("The Height of a Cylinder is %f and width is %f\n ", h, r);
        float volume =myCylinder.volume();
        float sa = myCylinder.surfaceArea();
        System.out.format("The Volume Of Cylinder Is %f\n",volume);
        System.out.format("The Surface Area of Cylinder is %f",sa);





    }
}
class Cylinder{
    private float radius;
    private float height;
    private final float pie = 3.14f;

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float surfaceArea(){
        return (2* pie * radius * height) + (2 * pie * radius);
    }
    public float volume(){
        return (pie * radius * radius * height);
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
}
