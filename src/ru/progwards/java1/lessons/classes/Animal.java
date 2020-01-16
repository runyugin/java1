package ru.progwards.java1.lessons.classes;

public class Animal {

    double weight;
    double koff;

    public Animal(double weight, double koff){
        this.weight = weight;
        this.koff = koff;
    }



    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    AnimalKind animal = AnimalKind.ANIMAL;

    public AnimalKind getKind() {
        return animal;
    }



    enum FoodKind {UNKNOWN, HAY, CORN};
    FoodKind unknown = FoodKind.UNKNOWN;

    public FoodKind getFoodKind() {
        return unknown;
    }

    public double getWeight(){
        return weight;
    }

    public double getFoodCoeff(){
        koff = 0.02;
        return koff;
    }

    public double calculateFoodWeight(){
        double calculateFoodWeight = weight*koff;
        return calculateFoodWeight;
    }


@Override
    public String toString() {
        return ("I am " + getKind() + ", eat " + getFoodKind());
    }


    public String toStringFull() {
        return ("I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight());
    }

}
