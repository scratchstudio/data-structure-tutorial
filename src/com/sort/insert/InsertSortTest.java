package com.sort.insert;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by kjnam on 2016. 5. 25..
 */
public class InsertSortTest {
    private int arr[];
    InsertSort insertSort;

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
    public void insertSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++)
            System.out.printf(" %d", arr[i]);
        System.out.println();

        long startTime = System.currentTimeMillis();
        insertSort = new InsertSort();
        insertSort.sort(arr, SIZE);

        long stopTime = System.currentTimeMillis();
        long elapesTime = stopTime - startTime;
        System.out.println();
        System.out.printf("소요시간: %d ms" ,elapesTime);

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1])
                fail("삽입 정렬 실패");
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
            for (int a=0; a<arr.length; a++)
                arr[a] = randomNumber.nextInt(MAX)+1;

            System.out.printf("\n%d번째 반복 >> 정렬할 원소: ", i+1);
            for (int j=0; j<arr.length; j++)
                System.out.printf(" %d", arr[j]);
            System.out.println();

            insertSort = new InsertSort();
            insertSort.sort(arr, SIZE);
            System.out.println();

        }

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i + 1])
                fail("삽입 정렬 실패");
        }
        assertTrue(true);
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

