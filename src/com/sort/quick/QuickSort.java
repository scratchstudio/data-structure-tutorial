package com.sort.quick;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class QuickSort {
    int i = 0;

    public int partition(int arr[], int begin, int end) {
        int pivot, temp, left, right, t;

        left = begin;
        right = end;
        pivot = (begin + end) / 2;
        System.out.printf("\n [퀵정렬 %d 단계: pivot=%d]\n", ++i, arr[pivot]);

        while (left < right) {
            while ((arr[left] < arr[pivot]) && (left<right)) left++;
            while ((arr[right] >= arr[pivot]) && (left<right)) right--;
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // left와 right를 교환하여 피봇원소의 위치가 변경된 경우
                if (left == pivot) {
                    pivot = right;
                }
            }
        } // end of while (left < right) {

        // (left > right)가 된 경우
        temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;

        for (t=0; t<arr.length; t++)
            System.out.printf("%3d ", arr[t]);
        System.out.println();
        return right;
    }

    public void sort(int arr[], int begin, int end) {
        if (begin < end) {
            int p;
            p = partition(arr, begin, end);
            sort(arr, begin, p-1);
            sort(arr, p+1, end);
        }
    }
}
