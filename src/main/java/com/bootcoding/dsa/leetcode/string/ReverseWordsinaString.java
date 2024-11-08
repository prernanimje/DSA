package com.bootcoding.dsa.leetcode.string;

public class ReverseWordsinaString {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String out = "";
        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }
        return out + str[0];
    }

    public static void main(String[] args) {
       reverseWords("Hello World");
    }
}
