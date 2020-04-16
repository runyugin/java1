package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {

    public static int checkBit(byte value, int bitNumber){

        for (int i = 1; i < bitNumber; i++){

            value = (byte) (value>>1);

        }

        return value&1;
    }

    public static void main(String[] args) {
        checkBit((byte) 0b0100101, 3);
    }

}
