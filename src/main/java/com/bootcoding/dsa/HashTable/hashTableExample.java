package com.bootcoding.dsa.HashTable;

import java.security.Key;
import java.util.HashMap;
import java.util.Objects;

public class hashTableExample {
    public static void main(String[] args) {
        int a[]={10,20,10,30,20,40};
        //FInd the duplicate elements in array

        HashMap<Integer,Integer> store = new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (store.containsKey(a[i])){
                int value=store.get(a[i]);
                store.put(a[i],value + 1);
            }else{
                store.put(a[i],1);
            }
        }
        for (Integer k : store.keySet()){
            int value=store.get(k);
            if (value >1){
                System.out.println(k);
            }
        }
    }
}
