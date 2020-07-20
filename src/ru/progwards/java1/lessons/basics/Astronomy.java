package ru.progwards.java1.lessons.basics;

public class Astronomy {

    static double pi = 3.14;
    static double r;
    static double result = 0;

    public static Double sphereSquare(Double r){

        result = 4*pi*r*r;
        System.out.println(result);
        return result;
    }

    public static Double earthSquare() {
        r = 6371.2;
        result = sphereSquare(r);
        return result;

    }

    public static Double mercurySquare() {
        r = 2439.7;
        result = sphereSquare(r);
        return result;
    }

    public static Double jupiterSquare() {
        r = 71492;
        result = sphereSquare(r);
        return result;
    }

    public static Double earthVsMercury() {
        result = earthSquare()/mercurySquare();
        return result;
    }

    public static Double earthVsJupiter() {
        result = earthSquare()/jupiterSquare();
        return result;
    }

    public static void main(String[] args) {
        sphereSquare(2.5);
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();
    }
}
