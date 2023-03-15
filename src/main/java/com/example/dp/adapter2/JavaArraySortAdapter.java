package com.example.dp.adapter2;

public class JavaArraySortAdapter implements Sorter {
    private JavaArraySort javaArraySort;

    public JavaArraySortAdapter(JavaArraySort javaArraySort) {
        this.javaArraySort = javaArraySort;
    }

    @Override
    public int[] sort(int[] array) {
        javaArraySort.sort(array);
        return array;
    }
}
