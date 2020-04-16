package ru.progwards.java.lessons;

public class TriangleSimpleInfo {
    
    public static int maxSide(int a, int b, int c){

        int n = a;
        
        if (a>=b & a>=c){
            n = a;
        }
        else if (b>=a & b>=c){
            n = b;
        }
        else if(c>=a & c>=b){
            n = c;
        }
        System.out.println(n);
        return n;
    }

    public static int minSide(int a, int b, int c){

        int n = a;

        if (a<=b & a<=c){
            n = a;
        }
        else if (b<=a & b<=c){
            n = b;
        }
        else if(c<=a & c<=b){
            n = c;
        }
        System.out.println(n);
        return n;
    }


    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean result = a==b && a==c && b==c;
        System.out.println(result);
        return result;

    }


    public static void main(String[] args) {
        maxSide(21, 21, 21);
        minSide(21, 21, 11);
        isEquilateralTriangle(21, 21, 21);
    }
}
