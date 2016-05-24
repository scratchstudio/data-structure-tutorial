package com.sort.quick;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class QuickSortTest {

    private int arr[];
    QuickSort quickSort;

    @Before
    public void setUp() {
        arr = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
        quickSort = new QuickSort();
    }

    @Test
    public void quickSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
        quickSort.sort(arr, 0, 7);
    }

    /*
    정렬할 원소:  69 10 30  2 16  8 31 22

     [퀵정렬 1 단계: pivot=2]
      2  10  30  69  16   8  31  22

     [퀵정렬 2 단계: pivot=16]
      2  10   8  16  69  30  31  22

     [퀵정렬 3 단계: pivot=10]
      2   8  10  16  69  30  31  22

     [퀵정렬 4 단계: pivot=30]
      2   8  10  16  22  30  31  69

     [퀵정렬 5 단계: pivot=31]
      2   8  10  16  22  30  31  69
    */
}
