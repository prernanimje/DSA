package com.bootcoding.dsa.Array;

public class Divisiableby3 {
    public static void main(String[] args) {
        int []arr={9,5,6,3,4};
        array(arr);

    }
    public static void array(int []arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                System.out.println(arr[i]);
            }
        }
    }
}
