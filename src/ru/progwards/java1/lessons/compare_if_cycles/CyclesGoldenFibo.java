package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit){

        boolean result = number==digit;
        return result;
    }

    public static int fiboNumber(int n) {


        int fib = 1;
        int temp = 0;

        for (int i = 2; i <= n; i++) {
            int last = fib;
            fib += temp;
            if (fib < 0) return last;
            temp = last;
        }

        return fib;


    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        double min = 1.61703;
        double max = 1.61903;
        double dab = (double)a/(double)b;
        double dac = (double)a/(double)c;
        double dcb = (double)c/(double)b;
        double dca = (double)c/(double)a;
        double dbc = (double)c/(double)b;
        double dba = (double)c/(double)a;

        boolean result = (a==b || c==b || a==c ) && ((dab>=min && dab<=max) || (dac>=min && dac<=max) || (dcb>=min && dcb<=max) || (dca>=min && dca<=max) || (dbc>=min && dbc<=max) || (dba>=min && dba<=max));


        return result;
    }



    public static void main(String[] args) {

        int fiba = 1;
        int temp = 0;

        for (int i = 1; i <= 15; i++) {
            int last = fiba;
            fiba += temp;
            temp = last;

            if(fiba >= 100) {
                break;
            }
            System.out.print(fiba+", ");


        }


    }
}
