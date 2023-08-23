package com.bootcoding.dsa.EveningArray;

public class CopyInReverse {
    public static void main(String[] args) {
        int[] old = {20, 25, 1, 0, 2, 5, 4};
        int[] new1 = new int[old.length];
        for (int i=0;i<old.length;i++){
            new1[i]=old[i];

        }
        for (int i=new1.length-1;i>=0;--i){
            System.out.println(new1[i]);
        }
    }
}
