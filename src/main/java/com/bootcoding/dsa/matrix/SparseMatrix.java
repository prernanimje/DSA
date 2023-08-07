package com.bootcoding.dsa.matrix;

public class SparseMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;arr[0][1] =0;arr[0][2] = 1;
        arr[1][0] = 0;arr[1][1] =1;arr[1][2] =0;
        arr[2][0] =0;arr[2][1] =0;arr[2][2] =0;
        sparse(arr);
    }

    private static void sparse(int[][] matrix) {
        int rows, cols, size, count = 0;
        rows = matrix.length;
        cols = matrix[0].length;
        size = rows * cols;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count > (size / 2)) {
            System.out.println("The given matrix is sparse");
        } else {
            System.out.println("The given matrix is  not sparse");

        }

    }
}

