package com.lb.demo.leetcode.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/17 17:13
 * @Description:
 * @UpdateDate: 2020/1/17 17:13
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode509 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int N) {
        int res = 0;
        List<Integer> fibonacciList = new ArrayList<>();
        for(int i = 1 ; i <= N ; i++){
            if(i <= 2){
                fibonacciList.add(1);
            } else {
                fibonacciList.add(fibonacciList.get(i - 3) + fibonacciList.get(i - 2));
            }
        }
        if(N > 0){
            res = fibonacciList.get(N - 1);
        }
        return res;
    }

}
