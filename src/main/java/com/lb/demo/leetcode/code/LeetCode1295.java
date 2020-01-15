package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/7 18:27
 * @Description:
 * @UpdateDate: 2020/1/7 18:27
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1295 {

    public static void main(String[] args) {
        int[] test_1 = {12,345,2,6,7896};
        System.out.println(findNumbers(test_1));

        int[] test_2 = {555,901,482,1771};
        System.out.println(findNumbers(test_2));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int len = 0;
            do {
                num = num / 10;
                len++;
            } while (num > 0);
            if(len % 2 == 0)
                count++;
        }
        return count;
    }
}
