package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c){
        int n = a;
        if (a>b && a>c ) 
            n = a;
        
        else if (b>a && b>c ) 
            n = b;
        
        else if (c>a && c>b ) 
            n = c;

        return n;
    }

    public static int minSide(int a, int b, int c){
        int n = a;
        if (a<b && a<c )
            n = a;

        else if (b<a && b<c )
            n = b;

        else if (c<a && c<b )
            n = c;

        return n;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean result = a==b && a==c;
        return result;
    }


    public static void main(String[] args) {
        maxSide(10, 15, 12);
        minSide(10, 15, 12);
        isEquilateralTriangle(20, 20, 20);
    }
}
