package com.sort.merge;

/**
 * Created by kjnam on 2016. 5. 26..
 */
public class MergeSort {
    private int tempMergeArr[] = new int[30];

    public void merge(int arr[], int lowerIndex, int middle, int higherIndex) {
        int size = arr.length;
        int i, j, k, t;
        i = lowerIndex;
        j = middle + 1;
        k = lowerIndex;

        while (i<=middle && j<=higherIndex) {
            if (arr[i] <= arr[j])
                tempMergeArr[k] = arr[i++];
            else
                tempMergeArr[k] = arr[j++];

            k++;
        }

        if (i>middle) {
            for (t=j; t<=higherIndex; t++, k++)
                tempMergeArr[k] = arr[t];
        }
        else {
            for (t=i; t<=middle; t++, k++)
                tempMergeArr[k] = arr[t];
        }

        for (t=lowerIndex; t<=higherIndex; t++)
            arr[t] = tempMergeArr[t];

        System.out.printf("\n병합 정렬 >> ");
        for (t=0; t<size; t++)
            System.out.printf("%3d ", arr[t]);
    }

    public void sort(int arr[], int lowerIndex, int higherIndex) {
        int middle;
        if (lowerIndex < higherIndex) {
            middle = (lowerIndex+higherIndex) / 2;
            sort(arr, lowerIndex, middle);
            sort(arr, middle+1, higherIndex);
            merge(arr, lowerIndex, middle, higherIndex);
        }
    }
}
