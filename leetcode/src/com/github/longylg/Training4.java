package com.github.longylg;

/**
 * @author liyulong
 * @Description
 * @date 2020-03-05 9:52 上午
 */
public class Training4 {

    public static void main(String[] args) {
        Training4 training4 = new Training4();
        training4.distributeCandies(7, 4);
        training4.distributeCandies(10, 3);
    }

    /**
     * 分糖果 II
     * https://leetcode-cn.com/problems/distribute-candies-to-people
     */

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int begin = 1;
        while (candies > 0) {
            for (int i = 0; i < result.length; i++) {
                if (candies > begin) {
                    result[i] += begin;
                    candies -= begin;
                } else {
                    result[i] += candies;
                    candies = 0;
                }
                begin++;

            }
        }
        return result;
    }
}
