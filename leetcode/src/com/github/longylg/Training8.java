package com.github.longylg;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 * @author liyulong
 * @Description
 * @create 2020-03-10 3:31 下午
 */
public class Training8 {
    int result = 0;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.right.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(4);
        new Training8().diameterOfBinaryTree(treeNode);

    }

    /**
     * 二叉树的直径
     * https://leetcode-cn.com/problems/diameter-of-binary-tree/
     */
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode node) {
        if (node != null) {
            int leftDepth = dfs(node.left);
            int rightDepth = dfs(node.right);
            System.out.println(leftDepth);
            System.out.println(rightDepth);
            result = Math.max(result, leftDepth + rightDepth);
            return Math.max(leftDepth, rightDepth) + 1;
        } else {
            return 0;
        }

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
