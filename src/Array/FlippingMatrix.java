package Array;

import java.util.*;

public class FlippingMatrix {

    public static int flippingMatrix(int[][] matrix) {
        int n = matrix.length / 2;
        int sum = 0;
        int size = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int max = Math.max(
                        Math.max(matrix[i][j], matrix[i][size - 1 - j]),
                        Math.max(matrix[size - 1 - i][j], matrix[size - 1 - i][size - 1 - j])
                );

                sum += max;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {112, 42, 83, 119},
                {56, 125, 56, 49},
                {15, 78, 101, 43},
                {62, 98, 114, 108}
        };

        System.out.println("Maximum Sum: " + flippingMatrix(matrix));
    }
}