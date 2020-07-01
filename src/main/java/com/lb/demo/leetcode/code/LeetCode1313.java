package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/15 15:22
 * @Description:
 * @UpdateDate: 2020/1/15 15:22
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1313 {

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(decompressRLElist(nums));
    }
    //todo
    public static int[] decompressRLElist(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i+=2){
            res[i] = nums[2*i];
            res[i + 1] = nums[2*i+1];
        }
        for(int i = 0 ; i < res.length ; i++){
            System.out.println(res[i]);
        }
        return res;
    }
}
