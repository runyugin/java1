package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{

    Duck(double weight) {
        super(weight);
        foodcoef = 0.04;
    }


    @Override
    public Animal.AnimalKind getKind(){
        return Animal.AnimalKind.DUCK;
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
