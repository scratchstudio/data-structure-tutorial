package com.datastructure.tree.binarysearchtree;

/**
 * Created by kjnam on 2016. 5. 21..
 */
public class BinarySerchTree {
    private TreeNode root;

    public TreeNode insertKey(TreeNode root, char data) {
        TreeNode p = root;
        TreeNode newNode = new TreeNode();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;

        if (p == null) {
            return newNode;
        } else if (newNode.data < p.data) {
            p.left = insertKey(p.left, data);
            return p;
        } else if (newNode.data > p.data){
            p.right = insertKey(p.right, data);
            return p;
        } else {
            return p;
        }
    }

    public void insertBinarySerchTree(char data) {
        root = insertKey(root, data);
    }

    public TreeNode searchBinarySearchTree(char data) {
        TreeNode p = root;
        while (p != null) {
            if (data < p.data) p = p.left;
            else if (data > p.data) p = p.right;
            else return p;
        }

        return p;
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }

    public void printBinarySerchTree() {
        inOrder(root);
        System.out.println();
    }
}
