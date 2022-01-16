package com.retech.starter;

import java.time.LocalDate;
import java.util.Scanner;

public class userInput {
    //Also referred to as Scanner Class
    public static void main(String[] args){
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your online username: ");
        String username = scanner.nextLine();

        System.out.println(username+": That's kind cute mate\n");
        System.out.println("How old are you "+username+": ");
        int age = scanner.nextInt();
        int yearOfBirth = LocalDate.now().minusYears(age).getYear();

        System.out.println("So you were born in "+yearOfBirth);

    }
}
