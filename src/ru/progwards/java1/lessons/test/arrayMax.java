package ru.progwards.java1.lessons.test;

import java.util.Arrays;

public class arrayMax {
    public int arrayMax(int[] a) {
        Arrays.sort(a);
        int b = a.length - 1;
        int c = 0;
        if (0 > a.length) {
        } else if (1 <= a.length) {
            c = a[b];
        }

        return c;
    }

}