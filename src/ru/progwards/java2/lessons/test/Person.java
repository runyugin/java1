package ru.progwards.java2.lessons.test;

public class Person {
    private String name;
    private int age;
    private String country;

    public Person(){
        country = "RU";
    }

    Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }

}
