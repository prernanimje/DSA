package com.bootcoding.dsa.potd;

import java.util.ArrayList;

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
       int  matrix[][] = {{1, 2}, {3, 4}};
    findMinOperation(2,matrix);
    }
    public static void findMinOperation(int N, int[][] matrix) {
        // code here
        ArrayList<Integer> arrRowSum = new ArrayList<>();
        ArrayList<Integer> arrColSum = new ArrayList<>();

        for(int i=0; i<N; i++){
            int rowSum = 0;
            int colSum = 0;
            for(int j=0; j<N; j++){
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            arrRowSum.add(rowSum);
            arrColSum.add(colSum);
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arrRowSum.size(); i++){
            if(arrRowSum.get(i) > max) max = arrRowSum.get(i);

            if(arrColSum.get(i) > max) max = arrColSum.get(i);
        }
        int count = 0;
        for(int i=0; i<N; i++){
            count += Math.abs(max-arrRowSum.get(i));
        }
        System.out.println( count);
    }
}
