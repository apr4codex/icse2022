package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i + 2) == s.charAt(i + 3) && s.charAt(i) == 'X') {
                count++;
                i += 3;
            }
        }
        return count;
    }



        public static int minimumMoves(String s) {
        
        int count = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == 'X') {
                count++;
                i += 1;
            }
        }
        return count;
    }

    
}