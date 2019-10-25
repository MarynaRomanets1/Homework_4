package com.epam.homework4_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] arrayA = createMatrix(size);
        int[] arrayB = createMatrix(size);
        System.out.print("Array A    : ");
        printMatrix(arrayA);
        System.out.print("Array B    : ");
        printMatrix(arrayB);
        int[] arraySumAB = createMatrix(size);
        sumMatrix(arrayA, arrayB, arraySumAB);
        System.out.print("Array A + B: ");
        printMatrix(arraySumAB);
    }

    public static int[] createMatrix(int size) {
        Random random = new Random();
        int[] matrix = new int [size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(100);
        }
        return matrix;
    }
    public static int[] printMatrix(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        return array;
    }
    public static int[] sumMatrix(int[] arrayA, int[] arrayB, int[] arraySumAB) {
        for (int i = 0; i < arrayA.length; i++) {
             arraySumAB[i] = arrayA[i] + arrayB[i];
        }
        return arraySumAB;
    }
}
