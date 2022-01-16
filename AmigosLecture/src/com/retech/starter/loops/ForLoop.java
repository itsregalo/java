package com.retech.starter.loops;

import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args){
        int [] numArray = {100, 98, 80, 89, 90, 95};

        String [] bigBoys = {"Gift", "felix", "Victor", "Miriam"};

        //normal way
        for(int i=0; i<numArray.length; i++){
            System.out.println(numArray[i]);
        }

        System.out.println("\n");
        //reversed way

        for(int i=numArray.length-1; i>=0; i--){
            System.out.println(numArray[i]);
        }

        //use numArray.for to autocomplete

        System.out.println("\nShorter Method");
        Arrays.stream(numArray).forEach(System.out::println);

        //String Loops
        for(String name: bigBoys){
            if (name.equals("Miriam")){
                System.out.println("Miriam is a woman lad");
                break;
                //continue skips what's below
            }
            System.out.println(name);

        }

    }
}
