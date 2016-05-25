package com.sort.shell;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 25..
 */
public class ShellSortTest {
    ShellSort shellSort;
    int size;
    private int arr[];

    @Before
    public void setUp() {
        arr = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
        shellSort = new ShellSort();
        size = arr.length;
    }

    @Test
    public void shellSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i = 0; i < arr.length; i++)
            System.out.printf(" %d", arr[i]);
        System.out.println();
        shellSort.sort(arr, size);
    }

    /*
    정렬할 원소:  69 10 30 2 16 8 31 22

    셸정렬 1 단계: interval = 4 >>  16  8 30  2 69 10 31 22

    셸정렬 2 단계: interval = 2 >>  16  2 30  8 31 10 69 22

    셸정렬 3 단계: interval = 1 >>   2  8 10 16 22 30 31 69
    */

}