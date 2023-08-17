package com.bootcoding.dsa.potd;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
       int  Num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        List arr = Collections.singletonList(generateNextPalindrome(Num,11));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        Vector<Integer> v = new Vector<>();
        int m=n/2;
        int l=m-1;
        int r=(n%2 == 1) ? m+1 : m;
        while(l>=0 && num[l] == num[r]) {
            l--;
            r++;
        }
        int carry=0;
        if(l<0 || num[l] < num[r]) {
            carry=1;
        }
        l=m;

        if(n%2 == 0) {
            l=m-1;
        }
        r=m;
        while(l>=0) {
            num[l] = num[l] + carry;
            carry = num[l]/10;
            num[l] = num[l]%10;
            num[r] = num[l];
            l--; r++;
        }
        if(carry == 1) {

            num[n-1]=1;
            v.addElement(1);
        } else {

        }
        for(int ele:num) {
            v.add(ele);
        }
        return v;
    }
}
