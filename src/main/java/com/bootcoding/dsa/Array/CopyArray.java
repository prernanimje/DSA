package com.bootcoding.dsa.Array;

public class CopyArray {

    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int []newarr=new int[arr.length];
        for (int k=0;k<arr.length;k++){
            newarr[k]=arr[k];
            System.out.println(newarr[k]);
        }

    }
}
