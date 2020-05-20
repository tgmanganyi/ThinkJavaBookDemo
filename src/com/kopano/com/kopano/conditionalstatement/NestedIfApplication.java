package com.kopano.com.kopano.conditionalstatement;

public class NestedIfApplication {

    public static  void main(String[] args){
        int x =0;

        if(x == 0){
            System.out.println("x is zero");
        }else{
            if(x > 0){
                System.out.println("x is positive");
            }
            else{
                System.out.println("x is negative");
            }
        }

    }

}
