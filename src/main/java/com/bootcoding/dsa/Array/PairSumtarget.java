package com.bootcoding.dsa.Array;

public class PairSumtarget {
    public static void Pair(int [] numbers,int target){
        for (int i=0;i<numbers.length;i++){
            int first=numbers[i];
            for (int j=i+1;j<numbers.length;j++){
                int second=numbers[j];
                if (first+second==target){
                    System.out.println(first+","+second);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[]numbers={6,4,5,5,8,4,2,8};
        Pair(numbers,10);
    }
}
