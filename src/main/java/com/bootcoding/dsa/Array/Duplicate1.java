package com.bootcoding.dsa.Array;

public class Duplicate1 {
    public  void array(){
        int [] dup={10,7,10,9,7};
        for(int i=0;i<dup.length;i++) {
            for (int j = 0; j<i; j++) {
                if (dup[i]==dup[j]){
                    System.out.println(dup[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Duplicate1 d1= new Duplicate1();
        d1.array();

    }
}
