package com.bootcoding.dsa.Array;

public class runningSum {
    public static void Sum(int [] num){
        int a[] = new int[num.length];

        for ( int i=0;i<num.length;i++){
            int sum=0;
            for (int j=0;j<=i;j++){
                sum+=num[j];
            }
            a[i]=sum;
            System.out.println(sum);
        }


    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Sum(num);
    }

}