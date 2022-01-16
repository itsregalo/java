package com.retech.starter.loops;

public class ClassAndObjects {
    public static void main(String[] args){
    // The classes

        customUser user1 = new customUser(
                "itsregalo",
                "dev",
                true,
                2);

        System.out.println(user1.firstname);
        System.out.println(user1.lastname);
        System.out.println(user1.isAdult);
        System.out.println(user1.bodyCount);
    }

    static class customUser {
        String firstname;
        String lastname;
        boolean isAdult;
        int bodyCount;

        customUser(String firstname, String lastname, boolean isAdult, int bodyCount){
            this.firstname = firstname;
            this.lastname = lastname;
            this.isAdult = isAdult;
            this.bodyCount = bodyCount;
        }

    }
}
