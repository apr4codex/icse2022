package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++ ) {
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums1[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++ ) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums3[i] == nums1[j]) {
                    if (nums3[i] == 0) {
                        continue;
                    } else {
                        result.add(nums3[i]);
                        nums3[i] = 0;
                        nums1[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums2.length; j++ ) {
                if (nums3[i] == nums2[j]) {
                    if (nums3[i] == 0) {
                        continue;
                    } else {
                        result.add(nums3[i]);
                        nums3[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3.length; j++ ) {
                if (nums3[i] == nums3[j]) {
                    if (nums3[i] == 0) {
                        continue;
                    } else {
                        result.add(nums3[i]);
                        nums3[i] = 0;
                        nums3[j] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
}