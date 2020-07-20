package ru.progwards.javaold.lessons.classes;

public class Cow extends Animal{

    double koff = 0.05;

    public Cow(double weight) {
        super(weight);
    }

@Override
    public AnimalKind getKind() {
        AnimalKind cow = AnimalKind.COW;
        return cow;
    }

@Override
    public FoodKind getFoodKind() {
        FoodKind hay = FoodKind.HAY;
        return hay;
    }


@Override
    public double calculateFoodWeight(){
        return weight*koff;
    }
}
