package com.genirics;

public class MaximumGeniricsInString {
        public static <T extends Comparable<T>> T max(T x, T y, T z) {
            T Max = x;

            if (y.compareTo(Max) > 0)
                Max = y;

            if (z.compareTo(Max) > 0)
                Max = z;

            return Max;
        }

        public static void main(String args[]) {
            System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Rohith", "Rahul", "Vinay", max("Rohith",
                    "Rahul", "Vinay"));
        }
    }

