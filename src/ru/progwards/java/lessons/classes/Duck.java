package ru.progwards.java.lessons.classes;

public class Duck extends Animal{

    double koff = 0.04;

    public Duck(double weight) {
        super(weight);
    }

@Override
    public AnimalKind getKind() {
        AnimalKind duck = AnimalKind.DUCK;
        return duck;
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
