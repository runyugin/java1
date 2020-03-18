package ru.progwards.java1.lessons.test;

public class byteValue {


    public static void main(String[] args){
        byte value = 0b1001001;
        int value3 = value<<28;
        System.out.println(Integer.toBinaryString(value3));
        int result;

        if (value3 == -2147483648) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.println(Integer.toBinaryString(value));
        System.out.println(value);
        System.out.println(value3);
        System.out.println(Integer.toBinaryString(value3));
        System.out.println(result);
    }
}
