package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {

    public static boolean isTriangle(int a, int b, int c){
        boolean result = false;

        if((a!=0 && b!=0 && c!=0)&&(a+b>c || a+c>b || b+c>a)){
            result = true;
        }
        //System.out.println(result);
        return result;
    }

    public static boolean isRightTriangle(int a, int b, int c){

        boolean result = false;

        if((a!=0 && b!=0 && c!=0)&&(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)){
            result = true;
        }
        System.out.println(result);
        return result;
    }


    public static boolean isIsoscelesTriangle(int a, int b, int c){

        boolean result = false;

        if((a!=0 && b!=0 && c!=0)&&(a==c || a==b || b==c)){
            result = true;
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        isTriangle(1, 1, 1);
        isRightTriangle(6, 10, 8);
        isIsoscelesTriangle(8, 3, 8);
    }
}
