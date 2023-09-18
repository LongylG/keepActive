package com.github.longylg.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最长连续序列
 * https://leetcode.cn/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-100-liked
 *
 * @author liyulong
 * @date 2023-09-18 11:15
 */
public class Training17 {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        //去重
        int[] disNums = Arrays.stream(nums).distinct().toArray();
        int count = -1;
        for (int i = 0; i < disNums.length; i++) {
            int step = 0;
            while (i + 1 < disNums.length && disNums[i] + 1 == disNums[i + 1]) {
                step++;
                i++;
            }
            if (step > count) {
                count = step;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println(longestConsecutive(nums));
    }
}
