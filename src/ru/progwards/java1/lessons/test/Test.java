package ru.progwards.java1.lessons.test;

public class Test {

    static double fractional(double num){

        double result = num - Integer.valueOf((int) num);
        //System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        fractional(1.53);
    }
}
