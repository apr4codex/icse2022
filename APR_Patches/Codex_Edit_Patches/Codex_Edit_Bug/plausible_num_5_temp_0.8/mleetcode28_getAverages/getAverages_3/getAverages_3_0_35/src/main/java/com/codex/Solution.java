package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length - 2*k];
        for (int i = 0; i < nums.length - 2*k; i++) {
            int sum = 0;
            for (int j = i; j < i + 2*k + 1; j++) {
                sum += nums[j];
            }
            avgs[i] = sum / (2*k + 1);
            System.out.println("avgs[" + i + "] = " + avgs[i]);
        }
        return avgs;
    }

    
}