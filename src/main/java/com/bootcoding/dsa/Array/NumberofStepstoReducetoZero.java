package com.bootcoding.dsa.Array;

public class NumberofStepstoReducetoZero {
    //leapcode:1342  if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    public static void main(String[] args) {
       int count=0;
       int num=14;
       while (num!=0){
           if (num%2==0){
               num=num/2;
           }else {
               num=num-1;
           }
           count++;
       }
        System.out.println(count);
    }
}
