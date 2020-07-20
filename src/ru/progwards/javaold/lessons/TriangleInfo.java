package ru.progwards.javaold.lessons;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){


        boolean result = ((c < (a+b)) || (b < (a+c)) || (a < (c+b))) && (a!=0 && b!=0 && c!=0);
        System.out.println(result);
        return result;
    }

    public static boolean isRightTriangle(int a, int b, int c){

        boolean result = a*a==b*b+c*c || c*c==b*b+a*a || b*b==a*a+c*c;
        System.out.println(result);
        return result;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){

        boolean result = a==b || c==b || a==c;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        isTriangle(21, 21, 21);
        isRightTriangle(4, 3, 5);
        isIsoscelesTriangle(5, 5, 5);
    }
}
