package com.retech.starter.loops;

public class IfStatement {
    public static void main(String[] args){
        int hisAge = 20;
        int matesAge = 17;

        if (hisAge>matesAge){
            System.out.println(hisAge +" is greater than "+matesAge);
        }
        else if (hisAge == matesAge){
            System.out.println("There ages are equal... woo-ow");
        }
        else {
            System.out.println(hisAge +" is less than "+matesAge);
        }

    }
}
