package com.daleyzou.design.structure.adapter;

/**
 * BinarySearch
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 22:27
 * @version 1.2.0
 */
public class BinarySearch {
    public int binarySearch(int[] array, int key) {
        int low = 0;
        int hight = array.length - 1;
        while (low < hight){
            int middle = (low + hight) / 2;
            int middleValue = array[middle];
            if (middleValue < key){
                hight = middle;
            }else if (middleValue > key){
                low = middle;
            }else {
                return 1;
            }
        }
        return -1;
    }
}
