package ru.progwards.java1.lessons.test;

public class sumArrayItems {

    public int sumArrayItems(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum;
    }


}