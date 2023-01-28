package com.bootcoding.dsa.Search;

public class SelectionSort {
    public static void FindMin(int [] a){
        for (int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length-1;j++){
                 if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[]a={2,6,4,9,1};
       FindMin(a);
       printArray(a);
    }

    public static void printArray(int [] a){
        for (int j=0;j<a.length;j++){

            System.out.println(a[j]);
        }
    }
}
