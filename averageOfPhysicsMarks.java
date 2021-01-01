package com.company;

public class averageOfPhysicsMarks {
    public static void main(String[] args) {
        int marks [] = new int[]{ 54 , 62 , 66 , 87 ,37 ,48 ,69 , 31 , 69 , 87 };
        int avg = 0;
        int sum = 0;
        for (int element : marks) {
            sum = sum + element;




        }
        avg = sum/marks.length;
        System.out.println(avg);
    }
}
