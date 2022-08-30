package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add((int) num % 10);
            num /= 10;
        }
        list.sort(Integer::compareTo);
        long ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i) * Math.pow(10, i);
        }
        return ans;
    }

    
}