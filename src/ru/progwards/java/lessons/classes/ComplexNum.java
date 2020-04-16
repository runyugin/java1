package ru.progwards.java.lessons.classes;

public class ComplexNum {

    int a;
    int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }


    public ComplexNum newComplexNum(int a, int b) {
        return new ComplexNum(a, b);
    }
    @Override
    public String toString() {
        return a + "+" + b + "i";}
    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(num.a, num.b);}
    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(num.a , num.b); }
    public ComplexNum mul(ComplexNum num) {
        int a = num.a, b = num.b, c = num.a, d = num.b;
        return new ComplexNum(a * c - b * d, b * c + a * d); }
    public ComplexNum div(ComplexNum num) {
        int a = num.a, b = num.b, c = num.a, d = num.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }


    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(1, 56);
        ComplexNum b = new ComplexNum(1, 56);
        System.out.println(a.add(a));
        System.out.println(a.sub(a));
        System.out.println(a.mul(a));
        System.out.println(a.div(a));
    }

}
