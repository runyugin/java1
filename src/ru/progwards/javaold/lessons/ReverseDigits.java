package ru.progwards.javaold.lessons;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int a = number%10*100;
        int b = number%100 - number%10;
        int c = (number - number%100)/100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + b + c);
        return a + b + c;
    }

    public static void main(String[] args) {
        reverseDigits(112);
    }
}
