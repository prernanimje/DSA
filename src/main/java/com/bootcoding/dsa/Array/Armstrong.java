package com.bootcoding.dsa.Array;

public class Armstrong {
    public static void main(String[]args){
        int n=371;
        int temp =n;
        int rem;
        int sum=0;

        while(n!=0){

            int div = n/10;
            rem = n% 10;
            sum=sum+(rem*rem*rem);
            n = div;
        }
        if(sum==temp){
            System.out.println("This is Armstrong no");

        }else{
            System.out.println(" This is not Armstrong no");

        }
    }
}
