package com.example.dp.adapter2;

public class Main {
    public static void main(String[] args) {
        int[] abc = {1, 2, 7, 6, 4, 3, 9, 7};
        SorterClient sorterClient = new SorterClient();
        BubbleSorter bubbleSorter = new BubbleSorter();
        sorterClient.setSorter(bubbleSorter);
        int[] bubbleSortedArray = sorterClient.sortArray(abc);

        printArray(bubbleSortedArray);

        SorterClient sorterClient2 = new SorterClient();

        JavaArraySort javaArraySort = new JavaArraySorter();
        JavaArraySortAdapter javaArraySortAdapter = new JavaArraySortAdapter(javaArraySort);
        sorterClient2.setSorter(javaArraySortAdapter);

        int[] javaArraySortedArray = sorterClient2.sortArray(abc);

        printArray(javaArraySortedArray);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }

    }
}
