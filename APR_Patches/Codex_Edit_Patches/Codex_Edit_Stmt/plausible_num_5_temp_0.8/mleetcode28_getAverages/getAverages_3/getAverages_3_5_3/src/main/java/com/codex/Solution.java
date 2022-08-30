package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        for (int i = k; i < nums.length - k; i++) { // i < nums.length - k
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) { // j <= i + k
                sum += nums[j];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }

    
}