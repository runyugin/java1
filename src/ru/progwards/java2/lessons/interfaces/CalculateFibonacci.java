package ru.progwards.java2.lessons.interfaces;


public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static class CacheInfo {
        public int n;
        public int fibo;

        CacheInfo(int n, int fibo) {
            this.n = n;
            this.fibo = fibo;
        }
    }

    //В статической функции fiboNumber, проверять параметр n на совпадение с последним рассчитанным значением,
    //и если совпадает - возвращать уже готовый результат. Если не совпадает - рассчитывать и сохранять в статической переменной lastFibo
    public static int fiboNumber(int n) {
        int res = 1;
        if (lastFibo != null)
            if (lastFibo.n == n) {
                return lastFibo.fibo;
            }

        if (n != 1 && n != 2) {
            int a = 1;
            int b = 1;
            int c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            res = c;
        }
        lastFibo = new CacheInfo(n, res);
        return res;
    }

    public static CacheInfo getLastFibo() {
        return lastFibo;
    }

    public static void clearLastFibo() {
        lastFibo = null;
    }

    public static void main(String[] args) {
        lastFibo = new CacheInfo(1, 1);
        System.out.println(fiboNumber(10));
    }
}