package com.bootcoding.dsa.EveningArray;

public class GreaterThanAverage {
    public static void main(String[] args) {
        int[]old={1,7,2,4,9,10};
        int sum=0;
        int avg=0;
        int count=0;
        for (int i=0;i<old.length;i++){
            sum=sum+old[i];
            avg= sum/ old.length-1;
        }
        for (int i=0;i<old.length;i++){
            if (old[i]>avg){
                count++;
            }
        }
        int []new1= new int[count];
        int index=0;
        for (int i=0;i<old.length;i++){
            if (old[i]>avg){
                new1[index++]=old[i];
            }
        }
        for (int i=0;i<new1.length;i++){
            System.out.println(new1[i]);
        }
    }
}
