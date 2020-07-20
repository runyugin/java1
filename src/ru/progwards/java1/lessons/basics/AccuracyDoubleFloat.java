package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {



    static double result = 0;

    public static double volumeBallDouble(double radius){
        double pi = 3.14;
        double r = radius;
        result = 4.0/3.0*pi*r*r*r;
        return result;
    }

    public static float volumeBallFloat(float radius){
        float pi = 3.14F;
        float r = radius;
        result = 4.0f/3.0f*pi*r*r*r;
        return (float)result;
    }

    public static double calculateAccuracy(double radius){
        result = volumeBallDouble(radius) - volumeBallFloat((float)radius);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        volumeBallDouble(6371.2);
        volumeBallFloat(6371.2f);
        calculateAccuracy(6371.2);
    }
}
