package ru.progwards.javaold.lessons.classes;

public class RectangleHash {


    private double a;
    private double b;

    public RectangleHash(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        RectangleHash rec = (RectangleHash) anObject;
        return Double.compare(rec.area(), area()) == 0;
    }

    public static void main(String[] args) {
        new RectangleHash(2, 3).equals(new RectangleHash(3, 2));


    }
}