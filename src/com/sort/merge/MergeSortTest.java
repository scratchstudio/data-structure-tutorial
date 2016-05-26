package com.sort.merge;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by kjnam on 2016. 5. 26..
 */
public class MergeSortTest {
    private int arr[];
    private MergeSort mergeSort;

    private final static int SIZE = 7;
    private final static int MAX = 20;

    @Before
    public void setUp() {
        arr = new int[SIZE];
        Random randomNumber = new Random();
        for (int i=0; i<arr.length; i++)
            arr[i] = randomNumber.nextInt(MAX)+1;
    }

    @Test
    public void mergeSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++)
            System.out.printf(" %d", arr[i]);
        System.out.println();

        long startTime = System.currentTimeMillis();
        mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, SIZE -1);

        long stopTime = System.currentTimeMillis();
        long elapesTime = stopTime - startTime;
        System.out.println();
        System.out.printf("소요시간: %d ms" ,elapesTime);

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1])
                fail("병합 정렬 실패");
        }

        assertTrue(true);
    }

    @Test
    public void testRepeatability() {
        System.out.println("\n");
        System.out.println("=====반복 테스트=====");

        for (int i=0; i<200; i++) {
            arr = new int[SIZE];
            Random randomNumber = new Random();
            for (int a = 0; a<arr.length; a++) {
                arr[a] = randomNumber.nextInt(MAX)+1;
            }
            System.out.printf("\n%d번째 반복 >> 정렬할 원소: ", i+1);
            for (int j=0; j<arr.length; j++)
                System.out.printf(" %d", arr[j]);
            System.out.println();

            mergeSort = new MergeSort();
            mergeSort.sort(arr, 0, SIZE -1);
            System.out.println();
        }

        for (int j=0; j<arr.length-1; j++) {
            if (arr[j] > arr[j+1])
                fail("병합 정렬 실패");
        }
        assertTrue(true);
    }
}
