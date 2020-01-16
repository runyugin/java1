package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{



    public Hamster(double weight, double koff) {
        super(weight, koff);
    }

    AnimalKind hamster = AnimalKind.HAMSTER;


    public AnimalKind getKind() {
        return hamster;
    }

    FoodKind corn = FoodKind.CORN;
    public Animal.FoodKind getFoodKind() {
        return corn;
    }

    public double getFoodCoeff(){
        koff = 0.03;
        return koff;
    }

}
