package com.sort.bubble;

/**
 * Created by kjnam on 2016. 5. 24..
 */
public class BubbleSort {
    public void sort (int arr[]) {
        int i, j, temp, size;
        size = arr.length;

        for (i=size-1; i>0; i--) {
            System.out.printf("\n버블 정렬 %d 단계: ", size-i);

            for (j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.printf("\n\t");
                for (int k=0; k<size; k++)
                    System.out.printf("%3d ", arr[k]);
            }
        }
    }

}
