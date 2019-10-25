package com.epam.homework4_1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int[] array = createMatrix(15);
	    printMatrix(array);
        printMatrixReverse(array);

    }
    public static int[] createMatrix(int size) {
        Random random = new Random();
        int[] matrix = new int [size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(101);
        }
        return matrix;
    }
    public static int[] printMatrix(int[] array) {
        System.out.print("Array        : ");
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + "  ");
            }
        System.out.println();
        return array;
    }
    public static int[] printMatrixReverse(int[] array) {
        System.out.print("Array reverse: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf(array[i] + "  ");
        }
        System.out.println();
        return array;
    }

}
