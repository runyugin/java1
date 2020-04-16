package ru.progwards.java.lessons;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit){

        int res = 0;

        for (int i = 0; i <= 9; i++){

            int digitnumber = number%10;
            number = number/10;

            if (digitnumber==digit){
                res = digitnumber;
                break;
            }


        }


        boolean result = res == digit;
        System.out.println(result);
        return result;

    }










    public static void main(String[] args) {
        containsDigit(12345651, 7);
    }




}
