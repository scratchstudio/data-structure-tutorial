package com.sort.shell;

/**
 * Created by kjnam on 2016. 5. 25..
 */
public class ShellSort {
    public void intervalSort(int arr[], int begin, int end, int interval) {
        int i, j, item;
        for (i=begin+interval; i<=end; i=i+interval) {
            item = arr[i];
            for (j=i-interval; j>=begin && item<arr[j]; j-=interval)
                arr[j+interval] = arr[j];
            arr[j+interval] = item;
        }
    }

    public void sort(int arr[], int size) {
        int i, j, interval, t = 0;
        interval = size/2;
        while (interval >= 1) {
            for (i=0; i<interval; i++)
                intervalSort(arr, i, size-1, interval);
            System.out.printf("\n셸정렬 %d 단계: interval = %d >> ", ++t, interval);

            for (j=0; j<size; j++)
                System.out.printf("%3d", arr[j]);
            System.out.println();
            interval /= 2;
        }
    }
}
