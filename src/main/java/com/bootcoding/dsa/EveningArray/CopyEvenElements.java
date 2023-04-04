package com.bootcoding.dsa.EveningArray;

public class CopyEvenElements {
    //Q:Copy only even elements of a given array
    public static void main(String[] args) {
        int count=0;
        int []old={2,6,5,10,7};

        for (int i=0;i<old.length;i++){
            if(old[i]%2==0) {
                count++;
            }
        }
        int[]new1=new int[count];
        int index=0;
        for (int j=0;j<old.length;j++){
            if(old[j]%2==0) {
                new1[index++] = old[j];
            }
        }
        for (int i=0;i<new1.length;i++){
            System.out.println(new1[i]);
        }
    }
}
