package com.lb.demo.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/20 14:24
 * @Description: 0列视为A 1列视为B，取每对 A B 的最小值求和 minSumCost，求和过程中分别记录A-B的绝对值，并统计从A和B取值的个数
 *               如果A>B 进行调节 调节次数为 N - A 的绝对值次
 *               每次调节的内容为(取abs_A 总结果加差值绝对值，相当于总结果-A+B)
 *               如果A<B 取abs_B来作为调节序列
 * @UpdateDate: 2020/1/20 14:24
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1029 {

    public static void main(String[] args) {
        int[][] costs_1 = { {10 ,20} ,{30 ,200} ,{400 ,50} ,{30 ,20} };
        int[][] costs_2 = { {259,770} ,{448,54} ,{926,667} ,{184,139} ,{840,118} ,{577,469} };
        int[][] costs_3 = { {518,518} ,{71,971} ,{121,862} ,{967,607} ,{138,754} ,{513,337} ,{499,873} ,{337,387} ,{647,917} ,{76,417} };
        System.out.println(twoCitySchedCost(costs_1));
        System.out.println(twoCitySchedCost(costs_2));
        System.out.println(twoCitySchedCost(costs_3));
    }

    public static int twoCitySchedCost(int[][] costs) {
        int minSumCost = 0;
        List<Integer> abs_A = new ArrayList<>();
        List<Integer> abs_B = new ArrayList<>();

        for(int i = 0 ; i < costs.length ; i++){
            if(costs[i][0] <= costs[i][1]){
                minSumCost += costs[i][0];
                abs_A.add(Math.abs(costs[i][0] - costs[i][1]));
            } else {
                minSumCost += costs[i][1];
                abs_B.add(Math.abs(costs[i][0] - costs[i][1]));
            }
        }

        Collections.sort(abs_A);
        Collections.sort(abs_B);

        if(abs_A.size() != abs_B.size()){
            int difference = Math.abs(abs_A.size() - costs.length / 2);
            for(int i = 0 ; i < difference ; i++){
                if(abs_A.size() > abs_B.size()){
                    minSumCost += abs_A.get(i);
                } else {
                    minSumCost += abs_B.get(i);
                }
            }
        }
        return minSumCost;
    }

}
