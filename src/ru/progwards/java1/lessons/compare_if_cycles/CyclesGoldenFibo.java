package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) {

        boolean result = false;

        if (number == digit) {
            result = true;
        }
        for (int i = 0; number > 0; i++) {

            int res = number % 10;
            if (digit == res) {
                result = true;
            }
            System.out.println(res);
            number = number / 10;
        }
        System.out.println(result);
        return result;
    }


    public static int fiboNumber(int n) {

        int fib = 1;
        int temp = 0;

        for (int i = 2; n >= i; i++) {

            int last = fib;
            fib += temp;
            if (fib < 0) return last;
            temp = last;

            //System.out.println(last);
            //System.out.println(fib);
            //System.out.println(temp);

        }

        //System.out.println(result);
        return fib;


    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double min = 1.61703;
        double max = 1.61903;

        double d1 = (double) (a + c) / (2 * b);
        double d2 = (double) (a + b) / (2 * c);
        double d3 = (double) (c + b) / (2 * a);

        boolean result = (d1 >= min && d1 <= max) || (d2 >= min && d2 <= max) || (d3 >= min && d3 <= max);

        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {




        int fiba = 1;
        int temp = 0;

        for (int i = 1; i <= 15; i++) {
            int last = fiba;
            fiba += temp;
            temp = last;

            if (fiba >= 100) {
                break;
            }
            System.out.print(fiba + ", ");


        }
    }
}
