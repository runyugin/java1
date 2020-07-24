package ru.progwards.java1.lessons.classes;

public class Animal {

    double weight;
    double foodcoef = 0.02;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    enum FoodKind {UNKNOWN, HAY, CORN;}

    public Animal(double weight){
        this.weight = weight;
    }

    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }


    public double getWeight(){
        return weight;
    }

    public double getFoodCoeff(){
        return foodcoef;
    }

    public double calculateFoodWeight(){
        return weight*foodcoef;
    }

    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

}
