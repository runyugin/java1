package ru.progwards.java2.lessons.compare_if_cycles;

public class TriangleInfo {

    public static boolean isTriangle(int a, int b, int c){
        boolean isTriangle = c<(a+b) && a<(c+b) && b<(a+c);
        return isTriangle;
    }

    public static boolean isRightTriangle(int a, int b, int c){
        boolean result = a*a==b*b+c*c || c*c==b*b+a*a || b*b==a*a+c*c;
        return result;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result = a==b || c==b || a==c;
        return result;
    }

    public static void main(String[] args) {
        isTriangle(10, 15, 12);
        isRightTriangle(3, 4, 5);
        isIsoscelesTriangle(2, 2, 4);
    }
}
