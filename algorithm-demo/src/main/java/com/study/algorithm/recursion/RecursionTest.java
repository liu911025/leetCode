package com.study.algorithm.recursion;

public class RecursionTest {

    static int n = 100000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //printN1(n);
        printN2(n);
        System.out.println("消耗时间:" + (System.currentTimeMillis() - start));
    }

    public static void printN1(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printN2(int n) {
        if (n >= 0) {
            printN2(n - 1);
            System.out.println(n);
        }
    }
}
