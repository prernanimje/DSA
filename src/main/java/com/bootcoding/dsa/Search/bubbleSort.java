package com.bootcoding.dsa.Search;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={50,17,19,13,5};
        Sort(arr);
        printArray(arr);
    }

    public static void printArray(int [] a){
        for (int j=0;j<a.length;j++){

            System.out.println(a[j]);
        }
    }
    public static void Sort(int [] arr){
        for(int i=0;i< arr.length;i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}


