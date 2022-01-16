package com.retech.starter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Nonpremitive {
    public static void main (String[] args){

        LocalDate now = LocalDate.now();
        System.out.println(now);

        //string

        String name = new String("_itsregalo");
        System.out.println(name);
        //apply a method
        System.out.println(name.toUpperCase());

        //local date time
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);
    }

}
