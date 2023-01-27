package com.bootcoding.dsa.Search;

public class Kth {
    public static void main(String[] args) {
       int[] arr = {2,3,4,7,11};
       int x=5;
       int index=Calculate(arr,x);
        System.out.println(index);
    }

    public static int Calculate(int[] arr, int x) {

            int n = arr.length;
            int miss = 0;
            for(int i = 1; i <= arr[n - 1]; i++) {
                if(i == arr[miss]) {
                    miss++;
                    continue;
                }else {
                    x--;
                }
                if(x == 0) {
                    return i;
                }
            }

            return arr[n - 1] + x;
        }
    }

