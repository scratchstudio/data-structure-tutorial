package com.sort.insert;

/**
 * Created by kjnam on 2016. 5. 25..
 */
public class InsertSort {
    public void sort(int array[], int size) {
        int i, j, t, temp;

        for (i=1; i<size; i++) {
            temp = array[i];
            j = i;

            while ((j>0) && (array[j-1] > temp)) {
                array[j] = array[j-1];
                j--;
            }

            array[j] = temp;
            System.out.printf("\n삽입정렬 %d  단계: ", i);
            for (t=0; t<size; t++)
                System.out.printf("%3d", array[t]);
        }
        System.out.println();
    }
}
