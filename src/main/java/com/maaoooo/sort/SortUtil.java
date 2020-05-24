package com.maaoooo.sort;

import com.maaoooo.Algorithm.IAlgorithm;

/**
 * @author lzr
 * @date 2020 05 23 16:36
 * @description
 */
public class SortUtil {
    static int temp;

    /**
     * 生产有序数列
     *
     * @return
     */
    public static int[] getOrdinalSequence() {

        return null;
    }

    /**
     * 生成大小0-1000之间，值为0-1000之间的无序数组。
     *
     * @return
     */
    public static int[] getRandomSequence() {
        int count = (int) (Math.random() * 1000);
        int[] sums = new int[count];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = (int) (Math.random() * 1000);
        }
        return sums;
    }

    /**
     * 验证是否有序(全部相等，递增，递减)
     *
     * @param nums
     * @return
     */
    public static boolean isOrdinal(int[] nums) {
        int start = nums[0];
        int end = nums[nums.length - 1];
        //如果数列所有数字大小相等
        if (start == end) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == start) {

                } else {
                    return false;
                }
            }
            return true;
        }
        //数列递增
        if (end > start) {
            int pre = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (pre <= nums[i]) {
                    pre = nums[i];
                } else {
                    return false;
                }
            }
            System.out.println("递增排序。");
            return true;
        }
        //数列递减
        if (end < start) {
            int pre = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (pre >= nums[i]) {
                    pre = nums[i];
                } else {
                    return false;
                }
            }
            System.out.println("递减排序。");
            return true;
        }
        return true;
    }

    public static void testingAlgorithm(IAlgorithm algorithm, int[] nums) {
        int[] preNums = nums;
        System.out.println("原数组：");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        long startTime = System.nanoTime();
        algorithm.sort(nums);
        long endTime = System.nanoTime();
        System.out.println("\n\n该算法运行时间：" + (endTime - startTime) + "纳秒.");
        if (isOrdinal(nums)) {
            System.out.println("\n测试成功，成功排序！");
        } else {
            System.out.println("\n测试失败，排序失败！");
        }
        System.out.println("\n运行后数组：");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] nums, int a, int b) {
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

