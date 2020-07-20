package ru.progwards.java2.lessons.basics;

public class Astronomy {

    final static double π = 3.14;

    public static Double sphereSquare(Double r){
        r = r-0.0;
        double S = 4*π*r*r;
        System.out.println(S);
        return S;
    }

    public static Double earthSquare(){
        double E = sphereSquare(6371.2);
        return E;
    }

    public static Double mercurySquare(){
        double M = sphereSquare(2439.7);
        return M;

    }

    public static Double jupiterSquare(){
        double J = sphereSquare(71492.0);
        return J;
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
        sphereSquare(31.5);
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();
    }


}
