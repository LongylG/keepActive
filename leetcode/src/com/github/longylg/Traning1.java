package com.github.longylg;


/**
 * @author liyulong
 */
public class Traning1 {

    /**
     * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
     * <p>
     * 初始化 A 和 B 的元素数量分别为 m 和 n。
     * <p>
     * 示例:
     * <p>
     * 输入:
     * A = [1,2,3,0,0,0], m = 3
     * B = [2,5,6],       n = 3
     * <p>
     * 输出: [1,2,2,3,5,6]
     * 来源：力扣（LeetCode）
     */

    public static void merge(int[] A, int m, int[] B, int n) {
        //合并数组
        for (int i = 0; i < n; i++) {
            A[m + i] = B[i];
        }

        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp;
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 7, 0, 0, 0};
        int[] B = new int[]{2, 4, 7};
        Traning1.merge(A, 3, B, 3);
    }
}
