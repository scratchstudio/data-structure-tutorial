package com.datastructure.tree.binarysearchtree;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 21..
 */
public class BinarySerchTreeTest {
    BinarySerchTree bst;

    @Before
    public void setUp() {
        bst = new BinarySerchTree();
        bst.insertBinarySerchTree('G');
        bst.insertBinarySerchTree('I');
        bst.insertBinarySerchTree('H');
        bst.insertBinarySerchTree('D');
        bst.insertBinarySerchTree('B');
        bst.insertBinarySerchTree('M');
        bst.insertBinarySerchTree('N');
        bst.insertBinarySerchTree('A');
        bst.insertBinarySerchTree('J');
        bst.insertBinarySerchTree('E');
        bst.insertBinarySerchTree('Q');
    }

    @Test
    public void binarySearchTreeTest() {
        System.out.print("Binary Serch Tree >> ");
        bst.printBinarySerchTree();

        TreeNode p1 = bst.searchBinarySearchTree('A');
        assertThat(p1.data, is('A'));

        TreeNode p2 = bst.searchBinarySearchTree('Z');
        assertNull(p2);
    }

}
