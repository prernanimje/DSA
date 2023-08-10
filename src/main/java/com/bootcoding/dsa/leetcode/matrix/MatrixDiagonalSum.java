package com.bootcoding.dsa.leetcode.matrix;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;arr[0][1] = 2;arr[0][2] = 3;
        arr[1][0] = 0;arr[1][1] = 5;arr[1][2] = 6;
        arr[2][0] = 0;arr[2][1] = 8;arr[2][2] = 9;
        diagonalSum(arr);
    }
    public static int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum+=mat[i][j];
                    mat[i][j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i+j)==mat.length-1){
                    sum+=mat[i][j];
                }
            }

        }
      return sum;
    }
}
