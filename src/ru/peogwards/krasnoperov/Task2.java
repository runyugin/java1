package ru.peogwards.krasnoperov;

public class Task2 {

    double num;

    static double fractional(double num){
        double num1 = num % 1;
        return num1;
    }


    public static void main(String[] args) {
        fractional(1.53);
    }
}
