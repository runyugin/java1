package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {



    public static double volumeBallDouble(double radius){
        double π = 3.14;
        double R = radius;
        double volumeBallDouble = 4/3*π*R*R*R;
        return volumeBallDouble;
    }


    public static float volumeBallFloat(double radius){
        double π = 3.14;
        float pi = (float)π;
        float R = (float)radius;
        float volumeBallDouble = 4/3*pi*R*R*R;
        return volumeBallDouble;
    }

        public static double calculateAccuracy(double radius){
        float R = (float)radius;
        double calculateAccuracy = AccuracyDoubleFloat.volumeBallDouble(radius) - AccuracyDoubleFloat.volumeBallFloat(R);
        return calculateAccuracy;

    }

    public static void main(String[] args) {
        volumeBallDouble(6371.2);
        volumeBallFloat(6371.2);
        calculateAccuracy(6371.2);


    }



}
