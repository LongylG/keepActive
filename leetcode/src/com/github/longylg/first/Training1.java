package com.github.longylg.first;


/**
 * @author liyulong
 */
public class Training1 {

    /**
     *  合并排序的数组
     * https://leetcode-cn.com/problems/sorted-merge-lcci/
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
        Training1.merge(A, 3, B, 3);
    }
}
