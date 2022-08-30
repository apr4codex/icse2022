package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        //可以用的土地由1表示，farmland的左上角和右下角是连续的1，所以答案就是求farmland的左上角和右下角的坐标
        if (land == null || land.length == 0 || land[0] == null || land[0].length == 0) return new int[0][0];
        int row = land.length, col = land[0].length;
        int[][] result = new int[row * col][4];
        int iResult = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (land[i][j] == 0) continue;//遇到已经搜索过的点或者是土地不可用的点直接跳过
                result[iResult][0] = i;
                result[iResult][1] = j;
                result[iResult][2] = i;
                result[iResult][3] = j;
                dfsFindFarmland(land, i, j, iResult, result);
                iResult++;
            }
        }
        return Arrays.copyOf(result, iResult);
    }
    private static void dfsFindFarmland(int[][] land, int i, int j, int iResult, int[][] result) {
        land[i][j] = 0;
        if (i > 0 && land[i - 1][j] == 1) {
            result[iResult][0] = Math.min(result[iResult][0], i - 1);
            dfsFindFarmland(land, i - 1, j, iResult, result);
        }
        if (i < land.length - 1 && land[i + 1][j] == 1) {
            result[iResult][2] = Math.max(result[iResult][2], i + 1);
            dfsFindFarmland(land, i + 1, j, iResult, result);
        }
        if (j > 0 && land[i][j - 1] == 1) {
            result[iResult][1] = Math.min(result[iResult][1], j - 1);
            dfsFindFarmland(land, i, j - 1, iResult, result);
        }
        if (j < land[0].length - 1 && land[i][j + 1] == 1) {
            result[iResult][3] = Math.max(result[iResult][3], j + 1);
            dfsFindFarmland(land, i, j + 1, iResult, result);
        }
        if (i > 0 && j > 0 && land[i - 1][j - 1] == 1) {
            result[iResult][0] = Math.min(result[iResult][0], i - 1);
            result[iResult][1] = Math.min(result[iResult][1], j - 1);
            dfsFindFarmland(land, i - 1, j - 1, iResult, result);
        }
        if (i > 0 && j < land[0].length - 1 && land[i - 1][j + 1] == 1) {
            result[iResult][0] = Math.min(result[iResult][0], i - 1);
            result[iResult][3] = Math.max(result[iResult][3], j + 1);
            dfsFindFarmland(land, i - 1, j + 1, iResult, result);
        }
        if (i < land.length - 1 && j > 0 && land[i + 1][j - 1] == 1) {
            result[iResult][2] = Math.max(result[iResult][2], i + 1);
            result[iResult][1] = Math.min(result[iResult][1], j - 1);
            dfsFindFarmland(land, i + 1, j - 1, iResult, result);
        }
        if (i < land.length - 1 && j < land[0].length - 1 && land[i + 1][j + 1] == 1) {
            result[iResult][2] = Math.max(result[iResult][2], i + 1);
            result[iResult][3] = Math.max(result[iResult][3], j + 1);
            dfsFindFarmland(land, i + 1, j + 1, iResult, result);
        }
    }


    
}