package ru.progwards.java1.lessons.basics;

public class addAsStrings {

    static long factorial(long n){


        long startn=1;
        for(long i = 1; i <= n; i++) {

            startn *= i;
            System.out.println(startn);
        }

        return startn;
    }

    public static void main(String[] args) {
        factorial(56);
    }


}
