package com.maaoooo.sort;

import com.maaoooo.Algorithm.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lzr
 * @date 2020 05 23 17:57
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.maaoooo.springConfig.SortConfig.class)
public class Test {
    int[] nums = SortUtil.getRandomSequence();

    @Autowired
    SelectionSort selectionSort;

    @Autowired
    BubbleSort bubbleSort;

    @Autowired
    InsertionSort insertionSort;

    @Autowired
    ShellSort shellSort;
    /**
     * 选择排序
     */
    @org.junit.Test
    public void test() {
        SortUtil.testingAlgorithm(selectionSort, nums);
    }

    /**
     * 冒泡排序
     */
    @org.junit.Test
    public void test1() {
        SortUtil.testingAlgorithm(bubbleSort, nums);
    }

    /**
     * 插入排序
     */
    @org.junit.Test
    public void test2(){
        SortUtil.testingAlgorithm(insertionSort,nums);
    }

    /**
     * 希尔排序
     */
    @org.junit.Test
    public void test3(){
        SortUtil.testingAlgorithm(shellSort,nums);
    }
}
