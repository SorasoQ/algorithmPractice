package com.zjl.think.doublePointer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zjl
 */
public class SquareOfArray {
    public static int[] getTheSquareSort(int[]nums){
        int head = 0;
        int tail = nums.length-1;
        int temp = tail;
        int[] result = new int[nums.length];
        while (head <= tail) {
            if ((nums[head] * nums[head]) >= (nums[tail] * nums[tail])) {
                result[temp--] = nums[head] * nums[head];
                ++head;
            }else {
                result[temp--] = nums[tail] * nums[tail];
                --tail;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-5,-3,1,2,4,6,8};
        System.out.println(Arrays.toString(getTheSquareSort(nums)));
    }
}
