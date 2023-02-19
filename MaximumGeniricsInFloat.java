package com.genirics;

public class MaximumGeniricsInFloat {
        public static <T extends Comparable<T>> T max(T x, T y, T z) {
            T Max = x;
            if (y.compareTo(Max) > 0)
                Max = y;
            if (z.compareTo(Max) > 0)
                Max = z;

            return Max;
        }

        public static void main(String args[]) {
            System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 4.3, 5.2, 7.8, max(4.3,
                    5.2, 7.8));
        }
}
