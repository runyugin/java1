package ru.progwards.java2.lessons.bitsworld;

public class CheckBit {

    public static int checkBit(byte value, int bitNumber){
        int resulte = 0;

        for (int i = 0; i <= bitNumber; i++){

            resulte = value&1;

 //           System.out.println(Integer.toBinaryString(value));
 //           System.out.println(resulte);

            value = (byte) (value>>1);

        }

        return resulte;
    }

    public static void main(String[] args) {
        checkBit((byte) 24, 3);
    }

}
