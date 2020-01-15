package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/15 15:54
 * @Description: 因为水平、垂直、对角线移动耗时相同，所以对角线移动视为水平或者垂直移动
 *               所以每一步移动的最大距离为 X轴和Y轴距离差的最大值
 *               将最大值求和即可
 * @UpdateDate: 2020/1/15 15:54
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1266 {

    public static void main(String[] args) {
        int[][] points_test1 = {{1,1},{3,4},{-1,0}};
        int[][] points_test2 = {{3,2},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(points_test1));
        System.out.println(minTimeToVisitAllPoints(points_test2));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for(int i = 0 ; i < points.length -1 ; i++){
            int difference_X = Math.abs(points[i + 1][0] -  points[i][0]);
            int difference_Y = Math.abs(points[i + 1][1] -  points[i][1]);
            if(difference_X >= difference_Y){
                count += difference_X;
            } else {
                count += difference_Y;
            }
        }
        return count;
    }

}
