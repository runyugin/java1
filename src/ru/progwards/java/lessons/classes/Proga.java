package ru.progwards.java.lessons.classes;

public class Proga {
    public static void printInfo(Animal animal) {
        System.out.println(animal);
    }
    public static void main(String[] args) {
        Animal animal = new Animal(6);
        Cow cow = new Cow(6);
        Hamster hamster = new Hamster(6);
        Duck duck = new Duck(6);

        printInfo(animal);
        printInfo(cow);
        printInfo(hamster);
        printInfo(duck);
    }
}
