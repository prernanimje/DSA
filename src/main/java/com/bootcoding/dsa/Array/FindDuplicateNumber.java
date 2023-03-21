package com.bootcoding.dsa.Array;

import java.util.HashMap;

/*public class DuplicateHashmap {
    public  void array(){
        int [] dup={10,7,10,9,7};

        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i=0;i<dup.length;i++) {
            if(store.containsKey(dup[i])){
                int value=store.get(dup[i]);
                store.put(dup[i],value+1);
            }else {
                store.put(dup[i], 1);

            }
        }
        for (Integer k : store.keySet()){
            int value=store.get(k);
            if (value >1){
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        String firstArgument = args[0];

        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num3 = Integer.parseInt(args[3]);
        int num4 = Integer.parseInt(args[4]);
        int num5 = Integer.parseInt(args[5]);
        DuplicateHashmap d1= new DuplicateHashmap();
        d1.array();

    }
}*/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String arg : args){
            int count = map.getOrDefault(arg, 0);
            if(count>0){
                System.out.println("Duplicate elements " + arg);
            }
            map.put(arg, count +1);
        }
    }
}
