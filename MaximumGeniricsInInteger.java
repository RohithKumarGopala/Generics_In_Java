package com.genirics;

public class MaximumGeniricsInInteger {

        public static <T extends Comparable<T>> T max(T x, T y, T z) {
            T Max = x;

            if (y.compareTo(Max) > 0)
                Max = y;

            if (z.compareTo(Max) > 0)
                Max = z;

            return Max;
        }

        public static void main(String args[]) {
            System.out.printf("Maximum of %d, %d and %d is %d\n\n", 22, 33, 44, max(22, 33, 44));
        }
    }

