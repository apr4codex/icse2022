package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (containsVowels(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean containsVowels(String word) {
        boolean a = false, e = false, i = false, o = false, u = false, found = false;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                found = true;
                a = true;
            }
            if (c == 'e') {
                e = true;
                found = true;
            }
            if (c == 'i') {
                i = true;
                found = true;
            }
            if (c == 'o') {
                o = true;
                found = true;
            }
            if (c == 'u') {
                u = true;
                found = true;
            }
        }
        return a && e && i && o && u && found;
    }

    
}