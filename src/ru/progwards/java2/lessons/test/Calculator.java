package ru.progwards.java2.lessons.test;

public class Calculator {

    private int result;

    Calculator(){
        result = 0;
    }

    public int set(int num){
        result = num;
        return result;
    }
    public int add(int num){
        result += num;
        return result;
    }
    public int sub(int num){
        result -= num;
        return result;
    }
    public int getResult() {
        return result;
    }
}
