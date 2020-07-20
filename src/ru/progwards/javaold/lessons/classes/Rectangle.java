package ru.progwards.javaold.lessons.classes;


public class Rectangle {
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public int compareTo(Rectangle anRectangle) {
        if (this.area() > anRectangle.area())
            return 1;
        if (this.area() < anRectangle.area())
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Rectangle anRectangle = new Rectangle(2, 2);
        Rectangle anRectangle1 = new Rectangle(3, 2);
        anRectangle.compareTo(anRectangle1);
    }


}

