package com.retech.starter.loops;


public class SwitchStatements {
    public static void main(String[] args){
        String gender = new String("Male");

        switch(gender.toUpperCase()){
            case "FEMALE":
                System.out.println("yoh G, She's Female");
                break;

            case "MALE":
                System.out.println("He's male");
                break;
            case "Complicated":
                System.out.println("Shit's Complecated here");
                break;
            default:
                System.out.println("What, Here's unknown");
        }
    }
}
