package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            newString += arr[i];
        }
        return Long.parseLong(newString);
    }

    
}