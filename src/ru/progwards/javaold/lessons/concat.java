package ru.progwards.javaold.lessons;

public class concat {


    public static int minbit(byte value){
        int result = value & 0b00000001;
        System.out.println(result);
        return result;
    }

    public void main(String[] args) {
        minbit((byte) 0b1001001);

    }



}