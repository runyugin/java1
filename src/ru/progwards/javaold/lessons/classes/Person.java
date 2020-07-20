package ru.progwards.javaold.lessons.classes;

public class Person {

    public static class Child1{
        String hello() {
            return "привет";
        }
    }
    public class Child2 {
        String hello() {
            return "servus";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Person.Child1().hello());
        System.out.println(new Person().new Child2().hello());

        new Person.Child1().hello();
        new Person().new Child2().hello();
    }
}
