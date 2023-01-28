package com.bootcoding.dsa.Search;

public class InsertSort {

    public static void printArray(int [] a){
        for (int j=0;j<a.length;j++){

            System.out.println(a[j]);
        }
    }
    public static void Sort(int[] arr){
        for (int i=1;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int [] a={62,33,3,12,10};
        Sort(a);
        printArray(a);
    }
}
