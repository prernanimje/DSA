package com.bootcoding.dsa.Test1;

public class Sum {
    public static void Even(int[] array ){
        int count=0;
        int sum = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
                count++;
                sum = sum+ count;
                System.out.println(sum);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int [] array={2,3,7,11};
        Even(array);
    }
}
