package com.github.longylg.first;

/**
 * @author liyulong
 * @date 2020-03-18 10:00 上午
 */
public class Training15 {

    public static void main(String[] args) {
        int[] rec1 = new int[]{0, 0, 2, 2};
        int[] rec2 = new int[]{1, 1, 3, 3};
        System.out.println(new Training15().isRectangleOverlap(rec1, rec2));
    }

    /**
     * 矩形重叠
     * https://leetcode-cn.com/problems/rectangle-overlap/
     *
     * @param rec1
     * @param rec2
     * @return
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //使用逆向思维，考虑不重叠的情况
        return !(rec1[0] >= rec2[2] || rec1[2] <= rec2[0] || rec1[1] >= rec2[3] || rec1[3] <= rec2[1]);
    }
}
