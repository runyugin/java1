package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c){
        int result = 0;


        if(a>=b && a >=c){
           result = a;
        }

        else if(b>=a && b >=c){
            result = b;
        }

        else if(c>=a && c >=b){
            result = c;
        }

        System.out.println(result);
        return result;
    }

    public static int minSide(int a, int b, int c){
        int result = 0;

        if(a<=b && a <=c){
            result = a;
        }

        else if(b<=a && b <=c){
            result = b;
        }

        else if(c<=a && c <=b){
            result = c;
        }

        System.out.println(result);
        return result;
    }


    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean result = false;

        if(a==b && a==c && a!=0){
            result = true;
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        maxSide(0, 5, 5);
        minSide(11, 5, 5);
        isEquilateralTriangle(1, 1, 1);
    }

}
