package com.company;

public class classTommy {
    public static void main(String[] args) {
        Tommy vercitti = new Tommy();
        vercitti.hitting();
        vercitti.firing();
        vercitti.running();

    }
}
class Tommy{
    public void hitting(){
        System.out.println("hitting the enemy");
    }
    public void firing(){
        System.out.println("firing on the enemy");
    }
    public void running(){
        System.out.println("running from the enemy");
    }
}
