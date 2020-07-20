package ru.progwards.java2.lessons.test;

public class byteSet {
    // функция, возвращающая указанный бит
    public static int checkBit(byte value, int bitNumber) {
        int result = value >> bitNumber;
        result = result & 0b00000001;

        return result;
    }

    public static void main(String[] args) {
        byte value = 10;
        System.out.println(checkBit(value, 1));
    }
}