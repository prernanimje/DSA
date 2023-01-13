package com.bootcoding.dsa.Array;

public class positiveNumberCount {
    public static int maximumCount(int[] num) {

        int pos = 0;
        int neg = 0;
        for (int j : num) {
            if (j > 0) {
                pos++;

            } else if (j < 0) {
                neg++;

            }
        }
            return Math.max(pos, neg);
        }


    public static void main(String[] args) {
        int[]num = {-1,1,2,3,-5,4};

     int res= maximumCount(num);
        System.out.println(res);
    }
}