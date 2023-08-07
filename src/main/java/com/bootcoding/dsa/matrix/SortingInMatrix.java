package com.bootcoding.dsa.matrix;

public class SortingInMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;arr[0][1] = 2;arr[0][2] = 3;
        arr[1][0] = 0;arr[1][1] = 5;arr[1][2] = 6;
        arr[2][0] = 0;arr[2][1] = 8;arr[2][2] = 9;
        Number(arr);
    }
    private static void Number(int[][] matrix){
       for (int i=0;i< matrix.length;i++){
           for (int j=1;j< matrix.length;j++){
               if(matrix[i][j]>matrix[i][j+1]){
                   return;
               } else if (matrix[i][j]<matrix[i][j+1]) {
                   matrix[i][j]=matrix[j][i];
               }
               System.out.println(matrix[i][j]);
           }
       }
    }
}
