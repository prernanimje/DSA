package com.bootcoding.dsa.potd;

import java.util.*;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
         int []nums={1, 2, 3, 2, 1, 4};
        List agg= Collections.singletonList(singleNumber(nums));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int[] singleNumber(int[] nums)
    {
        // Code here
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue() == 1){
                res.add(e.getKey());
            }
        }
        Collections.sort(res);
        int[] ref = res.stream().mapToInt(i -> i).toArray();
        return ref;
    }
}
