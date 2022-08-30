package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static int countVowelSubstrings(String word) {
        int[] freq = new int[5];
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                updateFreq(word.charAt(j), freq);
                if (isVowelSubstring(freq)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static boolean isVowelSubstring(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i) == vowels[j]) {
                    freq[j]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}