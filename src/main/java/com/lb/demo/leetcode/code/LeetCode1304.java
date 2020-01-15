package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/15 17:59
 * @Description:
 * @UpdateDate: 2020/1/15 17:59
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1304 {

    public static void main(String[] args) {
        sumZero(3);
    }

    public static int[] sumZero(int n) {
        int[] res = new int[n];
        int size = n;
        //如果是奇数个，默认最后一个值为0，前面数组中元素 互为反数
        if(n % 2 != 0){
            size = n - 1;
            res[n - 1] = 0;
        }
        size = size/2;//循环一半即可 前半部分放正数 后半部分放负数 (互为反数)
        for(int i = 1 ; i <= size; i++){
            res[i - 1] = i;
            res[size + i - 1] = -i;
        }
        return res;
    }

}
