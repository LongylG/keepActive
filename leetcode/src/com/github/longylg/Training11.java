package com.github.longylg;

/**
 * @author liyulong
 * @date 2020-03-15 10:47 下午
 */
public class Training11 {

    public static void main(String[] args) {
        int[][] grid = new int[][]{new int[]{1, 1, 0, 0, 0}, new int[]{1, 1, 0, 0, 0}, new int[]{0, 0, 1, 1, 1}, new int[]{0, 0, 0, 1, 1}};
        new Training11().maxAreaOfIsland(grid);
    }

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0 || grid[i][j] == 2) {
            return 0;
        }
        grid[i][j] = 2;
        int num = 1;
        num += dfs(i + 1, j, grid);
        num += dfs(i - 1, j, grid);
        num += dfs(i, j + 1, grid);
        num += dfs(i, j - 1, grid);
        return num;

    }
}
