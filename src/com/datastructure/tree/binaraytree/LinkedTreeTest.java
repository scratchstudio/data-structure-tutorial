package com.datastructure.tree.binaraytree;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 21..
 */
public class LinkedTreeTest {
    LinkedTree tree;

    TreeNode n7;
    TreeNode n6;
    TreeNode n5;
    TreeNode n4;
    TreeNode n3;
    TreeNode n2;
    TreeNode n1;

    @Before
    public void setUp() {
        tree = new LinkedTree();
        n7 = tree.makeBinaryTree(null, 'D', null);
        n6 = tree.makeBinaryTree(null, 'C', null);
        n5 = tree.makeBinaryTree(null, 'B', null);
        n4 = tree.makeBinaryTree(null, 'A', null);
        n3 = tree.makeBinaryTree(n6, '/', n7);
        n2 = tree.makeBinaryTree(n4, '*', n5);
        n1 = tree.makeBinaryTree(n2, '-', n3);
    }

    @Test
    public void traversalTest() {
        System.out.print("PreOrder: ");
        tree.preOrder(n1);

        System.out.println();

        System.out.print("InOrder: ");
        tree.inOrder(n1);

        System.out.println();

        System.out.print("PostOrder: ");
        tree.postOrder(n1);

    }
}
