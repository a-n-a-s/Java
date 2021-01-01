package com.company;

public class classSphere {
    public static void main(String[] args) {
        Sphere sp = new Sphere();
        //sp.setRadius(7f);
        float r = sp.getRadius();
        System.out.format("The radius of Sphere is %f\n",r);
        float volume =sp.volume();
        float sa = sp.surfaceArea();
        System.out.format("The Volume Of Cylinder Is %f\n",volume);
        System.out.format("The Surface Area of Cylinder is %f",sa);

    }
}
class Sphere{
    private float radius;
    private final float pie = 3.14f;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float volume(){
        return 4/3 * pie*radius*radius*radius;

    }
    public float surfaceArea(){
        return 4*pie*radius*radius;
    }

    public Sphere() {
        this.radius = 7f;
    }

    public Sphere(float radius) {
        this.radius = radius;
    }
}
