package com.bootcoding.dsa.geeksforgeeks.array;

public class StockBuyandSellMaxoneTransactionAllowed {
    static int maximumPrice(int[]prices){
       int maxProfit=0;
       int buyPrice=Integer.MAX_VALUE;

       for(int price: prices){
           if(buyPrice> price){
               buyPrice=price;
           }else{
               maxProfit=Math.max(maxProfit,price-buyPrice);
           }
       }
       return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices={7,10,1,3,6,9,2};
        System.out.println(maximumPrice(prices));
    }
}
