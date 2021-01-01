package com.company;

public class classEmployee {
    public static void main(String[] args) {
        Employee anas = new Employee();
        anas.setName("AkAnasPro");
        anas.salary = 265;
        System.out.println(anas.getName());
        System.out.println(anas.getSalary());

    }


}
class Employee{
    int salary;
    String name;
    public int getSalary(){

        return salary;
    }
    public String getName() {
        return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }
}
