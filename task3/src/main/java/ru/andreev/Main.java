package ru.andreev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер матрицы: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Введите элементы матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int minValue = Integer.MAX_VALUE;


/*
        for (int i = 0; i < n; i++) {
            if (!(n % 2 != 0 && i == n / 2)) {
                minValue = Math.min(minValue, matrix[i][i]);
            }
        }
*/

        for (int i = 0; i < n; i++) {
            if (!(n % 2 != 0 && i == n / 2)) {
                minValue = Math.min(minValue, matrix[i][n - 1 - i]);
            }
        }

        System.out.println("Минимальный элемент на диагоналях: " + minValue);
    }
}