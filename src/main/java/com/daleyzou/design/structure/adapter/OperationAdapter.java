package com.daleyzou.design.structure.adapter;

/**
 * OperationAdapter
 * @description TODO
 * @author daleyzou
 * @date 2020年09月01日 21:39
 * @version 1.3.1
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;

    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
