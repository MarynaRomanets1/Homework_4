package com.epam.homework4_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] array = createMatrix(size);
        int[] arrayPos = new int[size];
        int[] arrayNeg = new int[size];
        int kPos = 0;
        int kNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.arraycopy(array, i, arrayPos, kPos, 1);
                kPos++;
            }
            else {
                System.arraycopy(array, i, arrayNeg, kNeg, 1);
                kNeg++;
            }
        }
        System.out.print("Array         : ");
        printMatrix(array);
        System.out.println("First step - Find Positive and Negative");
        System.out.print("Array Positive: ");
        printMatrix(arrayPos);
        System.out.print("Array Negative: ");
        printMatrix(arrayNeg);
        System.out.println("Second step - Arrays");
        int[] arrayPos1 = new int[kPos];
        System.arraycopy(arrayPos, 0, arrayPos1, 0 , kPos);
        System.out.print("Array Positive: ");
        printMatrix(arrayPos1);
        int[] arrayNeg1 = new int[kNeg];
        System.arraycopy(arrayNeg, 0, arrayNeg1, 0, kNeg);
        System.out.print("Array Negative: ");
        printMatrix(arrayNeg1);
    }

    public static int[] createMatrix(int size) {
        Random random = new Random();
        int[] matrix = new int [size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(60) - 10;
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
}
