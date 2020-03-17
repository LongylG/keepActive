package com.github.longylg.first;

/**
 * @author liyulong
 * @Description
 * @create 2020-03-05 4:55 下午
 */
public class Training5 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        new Training5().twoSum(nums, 9);
    }

    /**
     * 两数之和
     * https://leetcode-cn.com/problems/two-sum
     */

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        throw new IllegalArgumentException("no two number sum equals target!");
    }
}
