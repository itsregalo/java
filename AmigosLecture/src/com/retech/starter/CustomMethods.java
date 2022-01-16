package com.retech.starter;

public class CustomMethods {
    public static void main(String[] args){
        //method
        char [] charArray = {'A','A','A','B','C', 'D', 'D'};
        char searchLetter = 'A';
        int numOfArray = occurenceCounter(charArray, searchLetter);
        System.out.println(numOfArray);
    }

    //public means it's accessible by all classes
    public static  int occurenceCounter(char [] arrayToCount, char theLetter){
        int occurCount = 0;
        for(char letter : arrayToCount){
            if (letter == theLetter){
                occurCount++;
                continue;
            }
        }
        return occurCount;
    }
}
