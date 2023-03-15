package com.example.dp.adapter2;

public class SorterClient implements Client {
    private Sorter sorter;

    @Override
    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public int[] sortArray(int[] array) {
        return sorter.sort(array);
    }
}
