package ru.progwards.java2.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius) {
        double π = 3.14;
        double R = radius;
        System.out.println(4.0/3.0*π*R*R*R);
        return 4.0/3.0*π*R*R*R;
    }

    public static float volumeBallFloat(float radius) {
        float π = 3.14f;
        float R = radius;
        System.out.println(4.0/3.0*π*R*R*R);
        return 4.0f/3.0f*π*R*R*R;
    }

    public static double calculateAccuracy(double radius){
        return volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }

    public static void main(String[] args) {
        volumeBallDouble(6371.2);
        volumeBallFloat((float) 6371.2);
        calculateAccuracy(6371.2);
    }
}
