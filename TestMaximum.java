package com.genirics;

public class TestMaximum<T extends Comparable<T>> {
    T element1, element2, element3;

    public TestMaximum(T element1, T element2, T element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public T maximum() {
        return TestMaximum.maximum(element1, element2, element3);
    }

    public static <T extends Comparable<T>> T maximum(T element1, T element2, T element3) {
        T max = element1;
        if (element2.compareTo(max) > 0) {
            max = element2;
        }
        if (element3.compareTo(max) > 0) {
            max = element3;
        }
        printMax(element1, element2, element3, max);
        return max;
    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T element1, T element2, T element3, T max) {
        System.out.printf("Max of %s,%s and %s is %s\n", element1, element2, element3, max);
    }

    public static void main(String[] args) {
        Integer xInt = 22, yInt = 33, zInt = 44;
        Float xF1 = 7.2f, yF1 = 5.5f, zF1 = 6.6f;
        String xStr = "Rohith", yStr = "Rahul", zStr = "Vinay";

       //TestMaximum.testMaximum(xStr, yStr, zStr);
        new TestMaximum(xInt, yInt, zInt).maximum();
        new TestMaximum(xF1, yF1, zF1).maximum();
        new TestMaximum(xStr, yStr, zStr).maximum();
    }
}