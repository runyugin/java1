package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{

    Hamster(double weight) {
        super(weight);
        foodcoef = 0.03;
    }


    @Override
    public Animal.AnimalKind getKind(){
        return Animal.AnimalKind.HAMSTER;
    }


    @Override
    public Animal.FoodKind getFoodKind(){
        return Animal.FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff(){
        return foodcoef;
    }

}
