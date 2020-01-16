package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/16 18:17
 * @Description:
 * @UpdateDate: 2020/1/16 18:17
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1299 {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
    }

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int tmp = -1;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            res[i] = tmp;
            if(arr[i] >= tmp){
                tmp = arr[i];
            }
        }

        return res;
    }

}
