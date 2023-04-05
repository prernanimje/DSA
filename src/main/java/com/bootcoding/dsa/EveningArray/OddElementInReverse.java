package com.bootcoding.dsa.EveningArray;

public class OddElementInReverse {
    public static void main(String[] args) {
        int [] old={1,7,2,4,9,10};
        int count=0;
        for (int i=0;i<old.length;i++){
            if(old[i]%2!=0){
                count++;
            }
        }
        int [] new1=new int[count];
        int index=0;
        for (int i=0;i<old.length;i++){
            if (old[i]%2!=0){
                new1[index++]=old[i];
            }
        }
        for (int i=new1.length-1;i>=0;--i){
            System.out.println(new1[i]);
        }
    }
}
