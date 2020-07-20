package ru.progwards.java1.lessons;

//        Создайте класс Task2
//        В котором
//
//        1. Реализовать функцию public static void printJava() в которой следует: создать три строковые переменные со значениями:
//
//        "Хорошо идут дела"
//        "Изучаю Java я!"
//        " "
//
//        вывести на консоль, используя только эти переменные и функции System.out.print(), System.out.println() следующий текст:
//        Хорошо идут дела
//        Изучаю Java я!
//        Хорошо идут дела Изучаю Java я!
//        Изучаю Java я! Хорошо идут дела
//
//        2.1. Реализовать функцию public static int subtraction(int x, int y) в которой:
//        возвращать разницу x и y;
//        вывести на консоль следующий текст:
//        Вызвана функция subtraction() с параметрами x = ?, y = ?
//        где вместо знаков вопроса будут реальные значения.
//
//        2.2 Реализовать функцию public static int addition(int x, int y) которая будет:
//        возвращать сумму x и y;
//        выводить на консоль следующий текст:
//        Вызвана функция addition() с параметрами x = ?, y = ?
//        где вместо знаков вопроса будут реальные значения.
//
//        2.3 Реализовать функцию public static int multiplication(int x, int y) которая будет:
//        возвращать произведение x и y;
//        выводить на консоль следующий текст:
//        Вызвана функция multiplication() с параметрами x = ?, y = ?
//        где вместо знаков вопроса будут реальные значения.
//
//        2.4 Реализовать функцию public static void calculation() в которой следует:
//        объявить переменные типа int с названиями a, b, c;
//        переменной a присвоить значение 34, переменной b присвоить значение 55;
//        вывести значения переменных a и b на консоль так:
//        a = ?
//        b = ?
//        где вместо знаков вопроса будут их реальные значения;
//
//        после этого присвоить переменной c значение возвращённое функцией addition(), вызванной с параметрами x=a, y=b;
//        и вывести значения переменной c на консоль так:
//        a + b = ?
//        где вместо знака вопроса будет значение переменной c;
//
//        после этого присвоить переменной c значение возвращённое функцией subtraction(), вызванной с параметрами x=a, y=b;
//        и вывести значения переменной c на консоль так:
//        a - b = ?
//        где вместо знака вопроса будет значение переменной c;
//
//        после этого присвоить переменной c значение возвращённое функцией multiplication(), вызванной с параметрами x=a, y=b;
//        и вывести значения переменной c на консоль так:
//        a * b = ?
//        где вместо знака вопроса будет значение переменной c.
//
//        3. Реализовать функцию public static void main(String[] args) в которой:
//        - вызвать функцию printJava()
//        - вызвать функцию substruction() c параметрами 45 и 12
//        - вызвать функцию substruction() c параметрами 23 и 55
//        - вызвать функцию addition() c параметрами 128 и 787
//        - вызвать функцию addition() c параметрами 528 и 387
//        - вызвать функцию multiplication() c параметрами 124 и 87
//        - вызвать функцию multiplication() c параметрами 1528 и 3


public class Task2 {

    public static void printJava(){
        String s1 = "Хорошо идут дела";
        String s2 = "Изучаю Java я!";
        String s3 = " ";

        System.out.println(s1);
        System.out.println(s2);

        System.out.print(s1);
        System.out.print(s3);
        System.out.println(s2);

        System.out.print(s2);
        System.out.print(s3);
        System.out.println(s1);
    }

    public static int subtraction(int x, int y){
       System.out.println("Вызвана функция subtraction() с параметрами x = " + x + ", y = " + y);
       return x-y;
    }

    public static int addition(int x, int y){
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        return x+y;
    }

    public static int multiplication(int x, int y){
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = " + y);
        return x*y;
    }

    public static void calculation(){

        int a,b,c;
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




    public static void main(String[] args)
    {
        printJava();
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
  //      calculation();
    }

}
