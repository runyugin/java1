package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int a = (number % 10)*100;
        number = number / 10;
        int b = (number % 10) * 10;
        int c = number / 10;
        return a + b + c;
    }

    static double fractional(double num){
        double z = num % 1;
        return z;
    }

    public static void main(String[] args) {
        reverseDigits(123);
        fractional(1.53);
    }
}
