package com.company;

public class reverseAnArray {
    public static void main(String[] args) {
        int [] array = { 1 , 2 , 3 , 4 , 5 , 6 , 7 };
        int l = array.length;
        int temp = 0;
        int n = Math.floorDiv(array.length,2);
        for (int i = 0; i < n; i++) {
            temp = array[i] ;
            array[i] = array[l - 1 - i];
            array[ l - 1 - i] = temp;
            
            

        }
        for (int element : array){
            System.out.println(element);
        }

    }
}
