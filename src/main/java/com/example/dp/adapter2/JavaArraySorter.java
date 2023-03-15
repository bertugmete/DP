package com.example.dp.adapter2;

import java.util.Arrays;

public class JavaArraySorter implements JavaArraySort {
    @Override
    public void sort(int[] array) {
        System.out.println("Java array sorter calisti.");
        Arrays.sort(array);
    }
}
