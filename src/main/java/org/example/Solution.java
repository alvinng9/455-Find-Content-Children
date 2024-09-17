package org.example;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //sort 2 arrays
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        //create 2 pointers for 2 given arrays
        int gIndex = 0;
        int sIndex = 0;
        //iterate when the two indexes are still in bounds
        while (gIndex < g.length && sIndex < s.length) {
            //move the index for the s array to the right if the current
            //size value is less than the greed value
            while(sIndex < s.length && s[sIndex] < g[gIndex]) {
                sIndex++;
            }
            //if s index is out of bound, break the loop
            if (sIndex == s.length) {
                break;
            } else {
                //add a content child to the result
                result++;
                sIndex++;
                gIndex++;
            }
        }
        return result;
    }
}
