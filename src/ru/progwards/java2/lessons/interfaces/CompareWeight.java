package ru.progwards.java2.lessons.interfaces;

public interface CompareWeight {

    public enum CompareResult {
        LESS,
        EQUAL,
        GREATER;
    }

    public double getWeight();

    public CompareResult compareWeight(CompareWeight smthHasWeight);
}