package com.bootcoding.dsa.Array;

public class Operations {
    public static int Count(String[]operations){
        int X=0;
        for (int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+'){
                X++;
            }else {
                X--;
            }
        }
        System.out.println(X);
        return X;
    }

    public static void main(String[] args) {
        String []operations={"--X","X++","X++"};
        Count(operations);
    }
}
