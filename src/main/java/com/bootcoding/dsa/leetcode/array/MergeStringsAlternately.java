package com.bootcoding.dsa.leetcode.array;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        mergeAlternately("abc","spid");
    }

    //1768. Merge Strings Alternately
        public static String mergeAlternately(String word1, String word2) {
            StringBuilder sb =new StringBuilder();
            int i=0;
            for(;i<word1.length()&&i<word2.length();i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            while(i<word1.length()){
                sb.append(word1.charAt(i++));
            }
            while(i<word2.length()){
                sb.append(word2.charAt(i++));
            }
            return sb.toString();
        }

    }


