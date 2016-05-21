package com.datastructure.tree.binaraytree;

/**
 * Created by kjnam on 2016. 5. 21..
 */
public class LinkedTree {
    private TreeNode root;

    public TreeNode makeBinaryTree(TreeNode bt1, Object data, TreeNode bt2) {
        root = new TreeNode();
        root.data = data;
        root.left = bt1;
        root.right = bt2;

        return root;
    }

    // 전위순회
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // 중위순회
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }

    // 후위순회
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }
    }
}
