package com.sort.selection;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class SelectionSortTest {

    private int arr[];
    SelectionSort selectionSort;

    @Before
    public void setUp() {
        arr = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
        selectionSort = new SelectionSort();
    }

    @Test
    public void selSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf(" %d", arr[i]);
        }
        System.out.println();
        selectionSort.sort(arr);
    }

    /*
    정렬할 원소:  69 10 30 2 16 8 31 22

    선택 정렬 1 단계:   2  10  30  69  16   8  31  22
    선택 정렬 2 단계:   2   8  30  69  16  10  31  22
    선택 정렬 3 단계:   2   8  10  69  16  30  31  22
    선택 정렬 4 단계:   2   8  10  16  69  30  31  22
    선택 정렬 5 단계:   2   8  10  16  22  30  31  69
    선택 정렬 6 단계:   2   8  10  16  22  30  31  69
    선택 정렬 7 단계:   2   8  10  16  22  30  31  69
    */
}
