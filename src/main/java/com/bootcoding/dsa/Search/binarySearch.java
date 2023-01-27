package com.bootcoding.dsa.Search;

public class binarySearch {
    public static void main(String[] args) {
        int [] a={2,3,4,5,6,7};
        int x=6;
       int index= BinarySearch(a,x, 0, a.length-1);
        System.out.println(x+index);

    }

    public static int BinarySearch(int[]a,int left,int x,int right){
        int  mid=(left+right)/2;
        if(x==a[mid]){
            return mid;
        }
        if(left==right){
            return -1;
        }
        if(x>a[mid]){
            return BinarySearch(a,x,mid+1,right);
        }else{
            return BinarySearch(a,x,mid-1,left);

        }
    }

}
