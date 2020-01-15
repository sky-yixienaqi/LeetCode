package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/8 11:45
 * @Description:
 * @UpdateDate: 2020/1/8 11:45
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1221 {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        int maxCount = 0;
        char[] chars = s.toCharArray();
        if(chars.length <= 3){
            maxCount = 1;
        } else {
            int count = 0;
            char tmp = chars[0];
            for(char c : chars){
                if(count == 0){
                    tmp = c;
                }

                if(tmp == c){
                    count++;
                } else {
                    count--;
                }
                if(count == 0){
                    maxCount++;
                }
            }
        }
        return maxCount;
    }

}
