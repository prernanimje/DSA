package com.bootcoding.dsa.potd;

public class PalindromeString {
    public static void main(String[] args) {
       isPalindrome("abba");
    }
    public static void isPalindrome(String S) {
        // code here
        int i = 0;
        int j =  S.length()-1;


        while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                System.out.println("false");
            }
            i++;
            j--;
        }

        System.out.println("true");
    }
}
