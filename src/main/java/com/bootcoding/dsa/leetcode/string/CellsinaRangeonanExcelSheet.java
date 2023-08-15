package com.bootcoding.dsa.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CellsinaRangeonanExcelSheet {
    public static void main(String[] args) {
        List arr = Collections.singletonList(cellsInRange("K1:L2"));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();

        char startRow = s.charAt(0);
        char startCol = s.charAt(1);
        char endRow = s.charAt(3);
        char endCol = s.charAt(4);

        while(startRow <= endRow) {
            while(startCol <= endCol) {
                ans.add(startRow + "" + startCol);
                startCol++;
            }
            startCol = s.charAt(1);
            startRow++;
        }
        return ans;
    }
}
