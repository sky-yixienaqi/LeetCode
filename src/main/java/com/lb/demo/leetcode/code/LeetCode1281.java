package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/7 17:45
 * @Description:
 * @UpdateDate: 2020/1/7 17:45
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1281 {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
        System.out.println(subtractProductAndSum(705));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;//和
        int product = 0;//积
        int i = 0;//循环标记
        do {
            if(i == 0) {
                product = n % 10;
            } else {
                product = (n % 10 * product);
            }
            sum += n % 10;
            n = n / 10;
            i++;
        } while (n > 0);
        return product - sum;
    }

}
