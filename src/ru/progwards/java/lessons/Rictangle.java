package ru.progwards.java.lessons;

public class Rictangle {
    int a;
    int b;
    int c;
    public boolean isok = false;


    public Rictangle(){
        isok = a+b>c && a+c>b && b+c>a;
    }

    public Rictangle(int a, int b, int c){
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int pirimmetr(){
        return a+b+c;

    }

    public void main(String[] args) {

        Rictangle rictangle1 = new Rictangle(2,6,5);
        System.out.println(rictangle1.pirimmetr());
    }
}
