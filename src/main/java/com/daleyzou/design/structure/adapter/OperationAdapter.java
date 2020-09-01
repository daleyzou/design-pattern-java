package com.daleyzou.design.structure.adapter;

/**
 * OperationAdapter
 * @description TODO
 * @author zoudaifa
 * @date 2020年09月01日 21:39
 * @version 1.3.1
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;

    private BinarySearch searchObj;

    public OperationAdapter() {
    }

    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }

    @Override
    public int search(int[] array, int key) {
        return 0;
    }
}
