package ru.progwards.javaold.lessons;

public class Astronomy {

    public static double pi = 3.14;

    public static Double sphereSquare(Double r){
        double S = 4*pi*r*r;
        System.out.println(S);
        return S;
    }

    public static Double earthSquare(){
        double r = 6371.2;
        double Sq = sphereSquare(r);
        return Sq;
    }

    public static Double mercurySquare(){
        double r = 2439.7;
        double Sm = sphereSquare(r);
        return Sm;
    }

    public static Double jupiterSquare(){
        double r = 71492.0;
        double Sj = sphereSquare(r);
        return Sj;
    }

    public static Double earthVsMercury() {
        double ems = earthSquare()/mercurySquare();
        return ems;
    }

    public static Double earthVsJupiter() {
        double emj = earthSquare()/jupiterSquare();
        return emj;
    }



    public static void main(String[] args) {
        sphereSquare(3.8);
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();
    }
}
