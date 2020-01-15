package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/7 18:22
 * @Description:
 * @UpdateDate: 2020/1/7 18:22
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCodeLCP1 {

    public static void main(String[] args) {
        int[] guess = {1,2,3};
        int[] answer = {1,2,3};
        System.out.println(game(guess, answer));
    }

    public static int game(int[] guess, int[] answer) {
        int count = 0;
        for(int i = 0 ; i < 3 ; i++){
            if(guess[i] == answer[i])
                count++;
        }
        return count;
    }

}
