package ru.progwards.java1.lessons.test;

public class Point2D {

    int x;
    int y;

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public String toString() {
        String result = String.valueOf(x + ","+ y);
        return result;
    }

}
