package com.sort.selection;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class SelectionSort {
    public void sort(int arr[]) {
        int i, j, minValueIdx;

        for (i=0; i<arr.length-1; i++) {
            minValueIdx = i;

            for (j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minValueIdx])
                    minValueIdx = j;
            }

            swap(arr, minValueIdx, i);

            System.out.printf("\n선택 정렬 %d 단계: ", i+1);
            for (j=0; j< arr.length; j++)
                System.out.printf("%3d ", arr[j]);
        }
    }

    public void swap (int arr[], int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
