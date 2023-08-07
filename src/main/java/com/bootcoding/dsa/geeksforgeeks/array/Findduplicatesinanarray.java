package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Findduplicatesinanarray {
    public static void main(String[] args) {
        int[]arr={1,1,2,3,5,5};
        List agg= Collections.singletonList(duplicates(arr, 3));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }

    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) > 1){
                ans.add(arr[i]);
                map.remove(arr[i]);
            }
        }

        Collections.sort(ans);

        if(ans.size()>0){
            return ans;
        }else{
            ans.add(-1);
            return ans;
        }

    }
}
