package com.bootcoding.dsa.leetcode.matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;arr[0][1] = 2;arr[0][2] = 3;
        arr[1][0] = 0;arr[1][1] = 5;arr[1][2] = 6;
        arr[2][0] = 0;arr[2][1] = 8;arr[2][2] = 9;

        int[][] agg=transpose(arr);

        for (int i = 0; i < agg.length; i++) {
            for (int j = 0; j < agg.length; j++) {
                System.out.print(agg[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int ans[][]= new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
