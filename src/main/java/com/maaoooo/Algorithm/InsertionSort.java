package com.maaoooo.Algorithm;

/**
 * @author lzr
 * @date 2020 05 24 10:40
 * @description 插入排序算法
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 * 算法描述
 *
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 *
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 */
public class InsertionSort implements IAlgorithm{
    public void sort(int[] nums) {
        int length=nums.length;
        int preIndex,current;
        for (int i = 1; i < nums.length; i++) {
            current=nums[i];
            preIndex=i-1;
            while(preIndex>=0&&nums[preIndex]>current){
                nums[preIndex+1]=nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1]=current;
        }
    }
}
