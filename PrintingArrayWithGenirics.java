package com.genirics;

public class PrintingArrayWithGenirics {


        public static <T> void toPrint(T[] Arr){
            for(T element: Arr){
                System.out.println(element);
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Integer[] intArr={ 22, 44, 55, 66, 77};
            Double[] doubleArr= { 2.7, 4.4, 6.8,9.2, 12.4};
            Character[] characterArr = { 'a', 'e', 'i', 'o', 'u'};

            PrintingArrayWithGenirics.toPrint(intArr);
            PrintingArrayWithGenirics.toPrint(doubleArr);
            PrintingArrayWithGenirics.toPrint(characterArr);
        }
    }

