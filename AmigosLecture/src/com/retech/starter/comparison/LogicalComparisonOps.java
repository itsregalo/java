package com.retech.starter.comparison;

public class LogicalComparisonOps {
    public static void main(String[] args){
        boolean isAdult = false;
        boolean isStudent = true;

        System.out.println(isAdult && isStudent); //all must be true
        System.out.println(isAdult || isStudent); // logical or
    }
}
