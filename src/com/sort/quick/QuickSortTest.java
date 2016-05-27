package com.sort.quick;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class QuickSortTest {
    private int arr[];
    QuickSort quickSort;

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
    public void quickSortTest() {
        System.out.printf("\n정렬할 원소: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();

        long startTime = System.currentTimeMillis();
        quickSort = new QuickSort();
        quickSort.sort(arr, 0, SIZE-1);

        long stopTime = System.currentTimeMillis();
        long elapesTime = stopTime - startTime;
        System.out.println();
        System.out.printf("소요시간: %d ms" ,elapesTime);

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1])
                fail("퀵 정렬 실패");
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

            quickSort= new QuickSort();
            quickSort.sort(arr, 0, SIZE-1);
            System.out.println();
        }

        for (int j=0; j<arr.length-1; j++) {
            if (arr[j] > arr[j+1])
                fail("퀵 정렬 실패");
        }
        assertTrue(true);
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
