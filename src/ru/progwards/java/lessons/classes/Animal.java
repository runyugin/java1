package ru.progwards.java.lessons.classes;

public class Animal {

    double weight;
    double koff = 0.02;
    enum AnimalKind{ANIMAL, COW, HAMSTER, DUCK};
    enum FoodKind{UNKNOWN, HAY, CORN};

    public Animal(double weight){
        this.weight = weight;
    };


    public AnimalKind getKind() {
        AnimalKind animal = AnimalKind.ANIMAL;
        return animal;
    }

    public FoodKind getFoodKind() {
        FoodKind unkown = FoodKind.UNKNOWN;
        return unkown;
    }

    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public double getWeight(){
        return weight;
    }

    public double getFoodCoeff(){
        return koff;
    }


    public double calculateFoodWeight(){
        return weight*koff;
    }

    public String toString(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " "  + calculateFoodWeight();

    }

}
