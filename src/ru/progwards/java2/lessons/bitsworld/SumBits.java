package ru.progwards.java2.lessons.bitsworld;



public class SumBits {
    public static int sumBits(byte value){

        int values = value & 0b0000000_0000000_0000000_11111111;



        int result = 0;
        while (values>0){
            result += values&1;
            values = (byte) (values>>1);
        }

         //     System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        sumBits((byte) 0b10000000);
    }
}