package com.example.dp.adapter2;

public class BubbleSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        System.out.println("Bubble sorter calisti");
        int temp;
        int counter, index;
        int length = array.length;

        for (counter = 0; counter < length - 1; counter++) {
            for (index = 0; index < length - 1 - counter; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}
