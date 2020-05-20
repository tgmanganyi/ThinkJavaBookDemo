package com.kopano.scannerclass;

import java.awt.*;
import java.util.Scanner;

public class ScannerClassDemo {

    public static  void main(String[] args){
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        //When you read an int followed by a String, something strange happens. It won't prompt you to enter the name
        System.out.println("What is your son's age");
        age = in.nextInt();
        System.out.println("Your son is " + age + " years Old");

        System.out.println("What is your name");
        name = in.nextLine();
        System.out.println("You said: " + name);

        System.out.println("\n");
        System.out.println("How old are you");
        age = in.nextInt();
        System.out.println("You said you are "+ age + " Years old");

    }

}
