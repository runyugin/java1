package ru.progwards.java.lessons.classes;

public class Hamster extends Animal{

    double koff = 0.03;

    public Hamster(double weight) {
        super(weight);
    }

@Override
    public AnimalKind getKind() {
        AnimalKind hamster = AnimalKind.HAMSTER;
        return hamster;
    }

@Override
    public FoodKind getFoodKind() {
        FoodKind corn = FoodKind.CORN;
        return corn;
    }


    @Override
    public double calculateFoodWeight(){
        return weight*koff;
    }
}
