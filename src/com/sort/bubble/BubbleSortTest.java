package com.sort.bubble;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class BubbleSortTest {
    private int arr[];
    BubbleSort bubbleSort;

    @Before
    public void setUp() {
        arr = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
        bubbleSort = new BubbleSort();
    }

    @Test
    public void bubbleSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++)
            System.out.printf(" %d", arr[i]);
        System.out.println();
        bubbleSort.sort(arr);
    }

    /*
    정렬할 원소:  69 10 30 2 16 8 31 22

    버블 정렬 1 단계:
            10  69  30   2  16   8  31  22
            10  30  69   2  16   8  31  22
            10  30   2  69  16   8  31  22
            10  30   2  16  69   8  31  22
            10  30   2  16   8  69  31  22
            10  30   2  16   8  31  69  22
            10  30   2  16   8  31  22  69
    버블 정렬 2 단계:
            10  30   2  16   8  31  22  69
            10   2  30  16   8  31  22  69
            10   2  16  30   8  31  22  69
            10   2  16   8  30  31  22  69
            10   2  16   8  30  31  22  69
            10   2  16   8  30  22  31  69
    버블 정렬 3 단계:
            2  10  16   8  30  22  31  69
            2  10  16   8  30  22  31  69
            2  10   8  16  30  22  31  69
            2  10   8  16  30  22  31  69
            2  10   8  16  22  30  31  69
    버블 정렬 4 단계:
            2  10   8  16  22  30  31  69
            2   8  10  16  22  30  31  69
            2   8  10  16  22  30  31  69
            2   8  10  16  22  30  31  69
    버블 정렬 5 단계:
            2   8  10  16  22  30  31  69
            2   8  10  16  22  30  31  69
            2   8  10  16  22  30  31  69
    버블 정렬 6 단계:
            2   8  10  16  22  30  31  69
            2   8  10  16  22  30  31  69
    버블 정렬 7 단계:
            2   8  10  16  22  30  31  69
    */

}
