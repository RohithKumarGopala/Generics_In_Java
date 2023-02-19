package com.genirics;

public class PrintingArray {

        public static void toPrint(Integer[] Arr){
            for(int element : Arr){
                System.out.println(element);
            }
            System.out.println();
        }
        public static void toPrint(Double[] Arr){
            for(Double element : Arr){
                System.out.println(element);
            }
            System.out.println();
        }
        public static void toPrint(Character[] Arr){
            for(Character element : Arr){
                System.out.println(element);
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Integer[] intArr = { 22, 44, 55, 66, 77};
            Double[] doubleArr = { 2.7, 4.4, 6.8,9.2, 12.4};
            Character[] charArr = { 'a', 'e', 'i', 'o', 'u'};

            PrintingArray.toPrint(intArr);
            PrintingArray.toPrint(doubleArr);
            PrintingArray.toPrint(charArr);
        }
    }

