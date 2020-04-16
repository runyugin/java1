package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){

        int result = 0;
        while (value>0){
            result += value&1;
            value = (byte) (value>>1);
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        sumBits((byte) 0b0100101);
    }
}
