package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {



    public Cow(double weight, double koff) {
        super(weight, koff);
    }

    AnimalKind cow = AnimalKind.COW;


    public AnimalKind getKind() {
        return cow;
    }


    FoodKind hay = FoodKind.HAY;
    public Animal.FoodKind getFoodKind() {
        return hay;
    }

    public double getFoodCoeff(){
        koff = 0.05;
        return koff;
    }



}
