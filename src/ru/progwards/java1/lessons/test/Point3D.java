package ru.progwards.java1.lessons.test;

public class Point3D extends Point2D{
    private int z;

    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        String result = String.valueOf(x + ","+ y + ","+ z);
        return result;
    }

}
