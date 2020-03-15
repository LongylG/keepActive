package com.github.longylg;

import java.util.Arrays;

/**
 * @author liyulong
 * @date 2020-03-13 6:25 下午
 */
public class Training10 {
    /**
     * 多数元素
     * https://leetcode-cn.com/problems/majority-element/
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}
