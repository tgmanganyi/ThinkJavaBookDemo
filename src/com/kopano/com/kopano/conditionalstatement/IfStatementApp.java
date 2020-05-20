package com.kopano.com.kopano.conditionalstatement;

public class IfStatementApp {

    public static  void main(String[] args){

        int x = 0;

        if(x > 0){
            System.out.println("x is positive");
        }

        //if else example
        System.out.println("\n");
        if(x % 2 == 0){
            System.out.println("x is even number");
        }else{
            System.out.println("x is odd number");
        }
    }
}
