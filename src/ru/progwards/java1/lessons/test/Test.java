package ru.progwards.java1.lessons.test;

public class Test {

    static double fractional(double num){

        double result = num - Integer.valueOf((int) num);
        //System.out.println(result);
        return result;
    }

    static int addAsStrings(int n1, int n2) {
        return Integer.parseInt("" + n1 + n2);
    }

    static String textGrade(int grade) {

        String result = "не определено";

        if (grade == 0) {
            result = "не оценено";
        }
        else if (grade > 0 && grade < 21) {
            result= "очень плохо";
        }
        else if (grade > 20 && grade < 41) {
            result= "плохо";
        }
        else if (grade > 40 && grade < 61) {
            result= "удовлетворительно";
        }
        else if (grade > 60 && grade < 81) {
            result= "хорошо";
        }
        else if (grade > 80 && grade < 101) {
            result= "отлично";
        }

        //System.out.println(result);
        return result;

    }


    static long factorial(long n){

        long cels=1;
        long p=n;

        for(long i=0;i<p;i++) {
            cels*=n;
            n = (n - 1);
        }
        if (p == 0) {
            cels = 1;
        }

        return cels;
    }




    public static void main(String[] args) {
        fractional(1.53);
        addAsStrings(446,4);
        textGrade(101);

        factorial(0);
    }
}
