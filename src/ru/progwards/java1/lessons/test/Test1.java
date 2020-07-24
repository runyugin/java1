package ru.progwards.java1.lessons.test;

public class Test1 {


    static long factorial(long n){

        long c = 1;
        long result = 1;

        if (n==0) { result = 1; }

        else if (n<10&&n>0) { result = n;}

        else if (n>10) {
            for(long i=0;i<n;i++){
                c = n%10;
                long temp = c;
                //System.out.println(c);
                n = n/10;

                temp *= c;
                result *= temp;
            }
        }
       System.out.println(result);
        return result;
    }





    public static void main(String[] args) {
        System.out.println("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");

        factorial(2225);
    }
}
