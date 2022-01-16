package com.retech.starter.loops;

public class WhileLoop {
    public static void main(String[] args){
        int count = 10;

        //while loop
        System.out.println("While Loop");

        while(count>=0){
            System.out.println("Yoh");
            count--;
        }

        //do while loop

        int doCount = 10;
        do{
            System.out.println("do while");
            doCount--;
        }while (doCount>=0);
    }
}
