package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/21 11:24
 * @Description:
 * @UpdateDate: 2020/1/21 11:24
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode122 {

    public static void main(String[] args) {
        int[] prices_1 = {7 ,1 ,5 ,3 ,6 ,4};
        int[] prices_2 = {1 ,2 ,3 ,4 ,5};
        int[] prices_3 = {7 ,6 ,4 ,3 ,1};
        System.out.println(maxProfit(prices_1));
        System.out.println(maxProfit(prices_2));
        System.out.println(maxProfit(prices_3));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        if(prices.length > 0){
            buy = prices[0];
            for(int i = 1 ; i < prices.length ; i++){
                if(prices[i] >= buy){
                    maxProfit += (prices[i] - buy);
                    buy = prices[i];
                } else {
                    buy = prices[i];
                }
            }
        }
        return maxProfit;
    }

}
