package ru.progwards.java.lessons.classes;


import java.util.Objects;

public class Rectang {
    private double a;
    private double b;

    public Rectang(double a, double b) {
        this.a = a;
        this.b = b;
    }



    public double area() {

        return a*b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectang rectang = (Rectang) o;
        return Double.compare(rectang.a, a) == 0 &&
                Double.compare(rectang.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}