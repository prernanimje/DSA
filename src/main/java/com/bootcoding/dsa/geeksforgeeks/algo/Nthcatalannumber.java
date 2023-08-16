package com.bootcoding.dsa.geeksforgeeks.algo;

import java.util.Collections;
import java.util.List;

public class Nthcatalannumber {
    public static void main(String[] args) {
        List agg= Collections.singletonList(findCatalan(5));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int findCatalan(int n) {
        // code here
        int mod=(int)1e9+7;
        if(n<=1){
            return 1;
        }


        int []dp=new int[n+2];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            // dp[i]=0;
            for(int j=0;j<i;j++){
                dp[i]=  (dp[i] + (int)((long)dp[j] * dp[i - j - 1] % mod)) % mod;
            }
        }

        return dp[n];
    }
}
