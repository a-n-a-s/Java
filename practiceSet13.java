package com.company;

class GoodMorning extends Thread{
    int i = 0;
    public void run(){
        while (i<10){
            System.out.println("Good Morning");

            i++;
        }


    }

}
//for Q2
/*class Welcome extends Thread{
    int j = 0;

    public void run(){
        while (j<10){
            try {
                Thread.sleep(2000);

            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
            j++;



        }
}*/
// For Q3
class Welcome extends Thread{
    int j = 0;

    public void run(){
        while (j<10){

            System.out.println("Welcome");
            j++;



        }
    }
public static class practiceSet13 {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        Welcome w = new Welcome();
        gm.setPriority(Thread.MAX_PRIORITY);
        System.out.println(gm.getPriority());
        gm.start();
        w.start();
        System.out.println(Thread.currentThread().getState());


    }
}
}
