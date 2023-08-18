package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        List arr = Collections.singletonList(isValid("()"));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{')
                st.push(curr);
            else {
                if (st.isEmpty())
                    return false;
                else if (!isMatching(st.peek(), curr)) {
                    return false;
                }
                else
                    st.pop(); // pop if closing brackets encounter
            }
        }
        return st.isEmpty();
    }
    public static boolean isMatching(char c1, char c2){
        return c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}';
    }
}
