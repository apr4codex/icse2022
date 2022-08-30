package com.codex;

import java.util.*;

public class Solution {
public static int sumOfBeauties(int[] nums) {

        int sum = 0;
        if (nums.length == 1) return 2;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] < nums[i+1]) {
                sum += 1;
            } else if (nums[i+1] < nums[i] && nums[i] < nums[i-1]) {
                sum += 1;
            } else {
                for (int j = 0; j < i-1; j++) {
                    for (int k = i+1; k < nums.length; k++) {
                        if (nums[j] < nums[i] && nums[i] < nums[k]) {
                            sum += 1;
                        }
                    }
                }
            }
        }
        return sum;
    }
}