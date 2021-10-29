package com.zjl.think.doublePointer;

/**
 * @author zjl
 */
public class RemoveTheNumber {
    public static int deleteTheNum(int[]nums,int target){
        int slowIndex = 0;
        int fastIndex = 0;
        for(fastIndex = 0;fastIndex < nums.length; fastIndex++){
            if(nums[fastIndex] != target){
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }

        }
        return slowIndex;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,3,4,5,6,7,8,9};
        System.out.println(nums.length);
        System.out.println(deleteTheNum(nums,2));
    }
}
