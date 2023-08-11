package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class RichestCustomerWealth {
    public static void main(String[] args) {
      int [][]accounts = {{1,5},{7,3},{3,5}};
        List agg= Collections.singletonList(maximumWealth(accounts));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth =0;

        for(int i=0; i<accounts.length; i++){
            int sum =0;
            for(int j=0; j<accounts[0].length; j++){
                sum += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
