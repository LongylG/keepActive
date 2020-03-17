package com.github.longylg.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liyulong
 * @Description
 * @create 2020-03-06 4:14 下午
 */
public class Training6 {
    public static void main(String[] args) {
        new Training6().findContinuousSequence(10);
    }

    /**
     * II和为s的连续正数序列
     * https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {

        List<int[]> result = new ArrayList<>();
        int i = 1;

        while (target > 0) {
            target -= i++;
            if (target > 0 && target % i == 0) {
                int[] array = new int[i];
                for (int k = target / i, j = 0; k < target / i + i; k++, j++) {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);
    }
}
