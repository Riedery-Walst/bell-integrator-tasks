package ru.andreev;

public class Main {
    public static void main(String[] args) {
        int[][] example = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < example.length; i++) {
            for (int j = i; j == i; j++) {
                if (example.length/2 != j)
                    if (example[i][j] < min)
                        min = example[i][j];
            }
        }

        for (int i = 0; i < example.length; i++) {
            for (int j = example.length - i - 1; j == example.length - i - 1; j--) {
                if (example.length/2 != j) {
                    if (example[i][j] < min)
                        min = example[i][j];
                }
            }
        }

        System.out.println(min);
    }
}