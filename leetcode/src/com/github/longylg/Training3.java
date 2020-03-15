package com.github.longylg;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author liyulong
 * @Description
 * @create 2020-03-04 9:45 上午
 */
public class Training3 {
    public static void main(String[] args) {
        int[][] grid1 = new int[][]{new int[]{2, 1, 1}, new int[]{1, 1, 0}, new int[]{0, 1, 1}};
        int[][] grid2 = new int[][]{new int[]{1, 2}};
        System.out.println(new Training3().orangesRotting(grid1));
        System.out.println(new Training3().orangesRotting(grid2));
    }

    /**
     * 腐烂的橘子
     * 链接：https://leetcode-cn.com/problems/rotting-oranges
     * @param grid
     * @return
     */
    public int orangesRotting(int[][] grid) {
        //找出腐烂的橘子坐标
        int remain = 0;
        int yMax = grid.length;
        int xMax = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                if (2 == grid[i][i1]) {
                    queue.add(new int[]{i, i1});
                }
                if (1 == grid[i][i1]) {
                    remain++;
                }
            }
        }
        if (remain <= 0) {
            return 0;
        }
        int time = 0;
        while (!queue.isEmpty()) {
            Queue<int[]> newQueue = new ArrayDeque<>();
            queue.forEach(ints -> {
                int k = ints[0];
                int v = ints[1];
                if (0 <= k + 1 && k + 1 < yMax) {
                    if (grid[k + 1][v] == 1) {
                        grid[k + 1][v] = 2;
                        newQueue.add(new int[]{k + 1, v});
                    }
                }
                if (0 <= k - 1 && k - 1 < yMax) {
                    if (grid[k - 1][v] == 1) {
                        grid[k - 1][v] = 2;
                        newQueue.add(new int[]{k - 1, v});
                    }
                }
                if (0 <= v + 1 && v + 1 < xMax) {
                    if (grid[k][v + 1] == 1) {
                        grid[k][v + 1] = 2;
                        newQueue.add(new int[]{k, v + 1});
                    }

                }
                if (0 <= v - 1 && v - 1 < xMax) {
                    if (grid[k][v - 1] == 1) {
                        grid[k][v - 1] = 2;
                        newQueue.add(new int[]{k, v - 1});
                    }
                }
            });
            queue.clear();
            if (!newQueue.isEmpty()) {
                queue.addAll(newQueue);
                time++;
            }
            newQueue.clear();

        }
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                if (1 == grid[i][i1]) {
                    return -1;
                }
            }
        }
        return time;
    }
}

