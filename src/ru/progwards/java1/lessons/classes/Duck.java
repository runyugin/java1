package ru.progwards.java1.lessons.classes;

public class Duck  extends Animal{


    public Duck(double weight, double koff) {
        super(weight, koff);
    }

    AnimalKind duck = AnimalKind.DUCK;

    public AnimalKind getKind() {
        return duck;
    }

    FoodKind corn = FoodKind.CORN;
    public Animal.FoodKind getFoodKind() {
        return corn;
    }

    public double getFoodCoeff(){
        koff = 0.04;
        return koff;
    }

}
