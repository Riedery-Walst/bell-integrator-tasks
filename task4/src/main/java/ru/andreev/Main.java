package ru.andreev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (не менее 4, только четные числа): ");
        Scanner in = new Scanner(System.in);

        int matrixSize = in.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];

        fillBoundary(matrix);

        printMatrix(matrix);

    }

    public static void fillBoundary(int[][] matrix) {
        int largestNum = matrix.length / 2 - 1;
        int rows = matrix.length;

        int topCounter = largestNum;
        int leftCounter = largestNum;
        int rightCounter = largestNum;
        int bottomCounter = largestNum;

        // Заполнение верхней границы
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < cols - i; j++) {
                matrix[i][j] = topCounter;
            }
            topCounter--;
        }

        // Заполнение левой границы
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < rows - i; j++) {
                matrix[j][i] = leftCounter;
            }
            leftCounter--;
        }

        // Заполнение правой границы
        for (int i = rows - 1; i > matrix.length / 2; i--) {
            for (int j = i; j >= rows - i - 1; j--) {
                matrix[j][i] = rightCounter;
            }
            rightCounter--;
        }

        // Заполнение нижней границы
        for (int i = rows - 1; i > matrix.length / 2; i--) {
            for (int j = i; j >= cols - i - 1; j--) {
                matrix[i][j] = bottomCounter;
            }
            bottomCounter--;
        }

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}