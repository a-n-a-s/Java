package com.company;

import java.util.Scanner;

class Library{
    String [] books;
    int noOfBooks;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
         }
    void addBook(String book){

        this.books[noOfBooks]  = book;
        noOfBooks++;
        System.out.println(book + " Has Been Added");
    }
    void showAvailableBooks(){
        System.out.println("The Books Available Are : ");
        for (String book: this.books
             ) {
            if (book==null){
                continue;
            }
            else {System.out.println("* " + book);}


        }
    }
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }


        }

public class libraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();

            
            
            

        }



    }


