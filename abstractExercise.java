package com.company;
// Q1 & Q2
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{

    @Override
    void write() {
        System.out.println("Write");

    }

    @Override
    void refill() {
        System.out.println("refill");

    }
    void changeNib(){
        System.out.println("changeNib");

    }
}
class Shape{
    int dim1;
    int dim2;

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}
//Q3 & Q5
class Monkey{
    void Jump(){
        System.out.println("Jump");
    }
    void Bite(){
        System.out.println("Bite");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicAnimal{
    public void Speak(){
        System.out.println("Hello!");
    }

    @Override
    public void eat() {
        System.out.println("Eat");

    }

    @Override
    public void sleep() {
        System.out.println("Sleep");

    }
}
//Q4
abstract class CellPhone{
    abstract void with();

    abstract void lift();

    abstract void disconnect();
}
class SmartPhone extends CellPhone{

    @Override
    void with() {
        System.out.println("Wait");
    }

    @Override
    void lift() {
        System.out.println("Lift");

    }

    @Override
    void disconnect() {
        System.out.println("Disconnect");

    }
    public void Camera(){
        System.out.println("Take Snap");
    }
}
//Q6 & Q7
interface TVRemote{
    void volumeUp();
    void volumeDown();
    void changeChannel();
}
class SmartTVRemote implements TVRemote{

    @Override
    public void volumeUp() {
        System.out.println("Volume+");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume-");

    }

    @Override
    public void changeChannel() {
        System.out.println("Channel is Changed");

    }
    public void netflix(){
        System.out.println("Opening Netflix");
    }
    public void assistant(){
        System.out.println("Hello I am Smart Tv Remote");

    }
}
class SmartTv extends SmartTVRemote{
    public void on(){
        System.out.println("Tv is On");
    }

}
public class abstractExercise {
    public static void main(String[] args) {
        CellPhone cp = new SmartPhone();
        cp.disconnect();
        cp.lift();
        cp.with();
        //cp.Camera(); --> is not allowed.
        //SmartPhone sp = new CellPhone(); --> is an error.

    }
}
