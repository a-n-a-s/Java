package com.company;

public class sortedOrNot {
    public static void main(String[] args) {
        int [] array = {48 , 63 , 98 , 101 , 102};
        boolean isSorted = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]){
                isSorted = false;
                break;
            }

        }
        if (isSorted){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }
        }

    }

