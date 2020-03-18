package ru.progwards.java.lessons;

public class Task2 {
    public static void printJava(){
        System.out.println("Хорошо идут дела");
        System.out.println("Изучаю Java я!");

        System.out.print("Хорошо идут дела");
        System.out.print(" ");
        System.out.println("Изучаю Java я!");

        System.out.print("Изучаю Java я!");
        System.out.print(" ");
        System.out.println("Хорошо идут дела");
    }

    public static int subtraction(int x, int y){
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x + ", y = " + y);
        return x - y;
    }

    public static int addition(int x, int y){
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        return x + y;
    }

    public static int multiplication(int x, int y){
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = " + y);
        return x * y;
    }

    public static void calculation(){
        int a, b, c;
        a = 34;
        b = 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c = addition(a,b);
        System.out.println("a + b = " + c);
        c = subtraction(a,b);
        System.out.println("a - b = " + c);
        c = multiplication(a,b);
        System.out.println("a * b = " + c);


    }

    public static void main(String[] args) {
        printJava();
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
    }
}
