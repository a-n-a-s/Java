package com.company;

public class classPhoneRinging {
    public static void main(String[] args) {
        ringingPhone asus = new ringingPhone();
        asus.callFriend();
        asus.ringing();
        asus.vibrating();

    }
}
class ringingPhone{
    public void ringing(){
        System.out.println("Ringing . . .");
    }
    public void vibrating(){
        System.out.println("vibrating ...");
    }
    public void callFriend(){
        System.out.println("Calling Asus ...");
    }
}