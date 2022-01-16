package com.retech;

public class Arrays {
    public static void main(String[] args){
        int [] numArray = new int[5];

        numArray[0] = 82;
        numArray[1] = 86;
        numArray[2] = 80;
        numArray[3] = 98;
        numArray[4] = 92;

        System.out.println(java.util.Arrays.toString(numArray));

        int [] nonSpecifiedArray = {98, 80, 84, 99, 100, 790};
        System.out.println(java.util.Arrays.toString(nonSpecifiedArray));
        System.out.println(nonSpecifiedArray.length);

        System.out.println("\n Grabbing via indexes");
        System.out.println(nonSpecifiedArray[2]);
    }
}
