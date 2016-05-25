package com.sort.insert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 25..
 */
public class InsertSortTest {
    private int arr[];
    InsertSort insertSort;
    int size;

    @Before
    public void setUp() {
        arr = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
        insertSort = new InsertSort();
        size = arr.length;
    }

    @Test
    public void insertSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++)
            System.out.printf(" %d", arr[i]);
        System.out.println();
        insertSort.sort(arr, size);
    }

    /*
    정렬할 원소:  69 10 30 2 16 8 31 22

    삽입정렬 1  단계:  10 69 30  2 16  8 31 22
    삽입정렬 2  단계:  10 30 69  2 16  8 31 22
    삽입정렬 3  단계:   2 10 30 69 16  8 31 22
    삽입정렬 4  단계:   2 10 16 30 69  8 31 22
    삽입정렬 5  단계:   2  8 10 16 30 69 31 22
    삽입정렬 6  단계:   2  8 10 16 30 31 69 22
    삽입정렬 7  단계:   2  8 10 16 22 30 31 69
    */

}

