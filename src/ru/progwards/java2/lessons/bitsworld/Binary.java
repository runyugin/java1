package ru.progwards.java2.lessons.bitsworld;

public class Binary {
    byte num=0;

    public Binary(byte num){
        this.num=num;
    }

    @Override
    public String toString(){
        String result="";
        for (int i=8;i>0;i--) {
            if ((num&1)==1) result= "1"+result;
            else result="0"+result;
            num = (byte) (num >> 1);
        }
        return result;
    }

 public static void main(String[] args) {
        Binary binary = new Binary((byte) -1);
        System.out.println(binary.toString());

    }
}
