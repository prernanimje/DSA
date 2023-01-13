package com.bootcoding.dsa.Array;

public class negativeNumberCount {


    public static void main(String[] args) {
        int [] element={1,2,5,-88,-9};
        int Result = getNegativeElement(element);

        System.out.println(Result);

    }

   public static int getNegativeElement(int [] element){
        int positive=0;
        int negative=0;
       for (int j : element) {
           if (j < 0) {
               negative++;
           } else {
               positive++;
           }
       }
       return Math.min(positive,negative);
   }
}
