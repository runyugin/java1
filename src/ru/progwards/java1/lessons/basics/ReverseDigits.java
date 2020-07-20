package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int c1 = number % 10;
        int c2 = number/10 % 10;
        int c3 = number/100 % 10;
        int result = Integer.valueOf(c1 + "" + c2 + "" + c3);
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        reverseDigits(456);
    }
}
