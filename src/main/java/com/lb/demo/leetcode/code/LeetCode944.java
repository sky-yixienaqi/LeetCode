package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/17 18:00
 * @Description:
 * @UpdateDate: 2020/1/17 18:00
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode944 {

    public static void main(String[] args) {
        String[] test_1 = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(test_1));

        String[] test_2 = {"a", "b"};
        System.out.println(minDeletionSize(test_2));

        String[] test_3 = {"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(test_3));
    }

    public static int minDeletionSize(String[] A) {
        int count = 0;
        int length = 0;
        if(A.length > 0){
            length = A[0].length();
        }

        for(int j = 0 ; j < length ; j++) {
            for(int i = 1 ; i < A.length ; i++){
                if(A[i].charAt(j) < A[i-1].charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
