package com.lb.demo.leetcode.code;

import java.util.Arrays;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/17 11:17
 * @Description:
 * @UpdateDate: 2020/1/17 11:17
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode977 {

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        sortedSquares(A);
    }

    public static int[] sortedSquares(int[] A) {
        for(int i = 0 ; i < A.length ; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

}
