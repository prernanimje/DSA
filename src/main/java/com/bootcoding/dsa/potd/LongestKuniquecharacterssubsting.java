package com.bootcoding.dsa.potd;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LongestKuniquecharacterssubsting {
    public static void main(String[] args) {
        List arr = Collections.singletonList(longestkSubstr("aabacbebebe",3));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        while(i<n && j<n)
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            count++;
            if(map.size()==k)
            {
                if(max<count)
                    max=count;
            }
            while(i<n && map.size()>k)
            {

                map.replace(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0)
                {
                    map.remove(s.charAt(i));
                }
                count--;
                i++;
            }
            j++;
        }
        if(max==0)
            return -1;
        return max;
    }
}
