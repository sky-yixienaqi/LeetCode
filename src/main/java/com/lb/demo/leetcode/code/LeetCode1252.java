package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/16 10:16
 * @Description:
 * @UpdateDate: 2020/1/16 10:16
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1252 {

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(n, m, indices));
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int[][] data = new int[n][m];

        for(int i = 0 ; i < indices.length ; i++){
            for(int column = 0 ; column < m ; column++){
                data[indices[i][0]][column] += 1;
            }

            for(int row = 0 ; row < n; row++){
                data[row][indices[i][1]] += 1;
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(data[i][j] % 2 != 0)
                    count++;
            }
        }
        return count;
    }

}
