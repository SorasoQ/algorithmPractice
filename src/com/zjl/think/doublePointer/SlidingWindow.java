package com.zjl.think.doublePointer;

/**
 * @author zjl
 */
public class SlidingWindow {
    public static int findTheMinSubArrayLen(int[]nums, int target){
        int fastIndex = 0,slowIndex = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for(fastIndex = 0; fastIndex < nums.length; fastIndex++){
            sum += nums[fastIndex];
            while (sum >= target){
                result = Math.min(result, fastIndex - slowIndex + 1);
                sum -= nums[slowIndex++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,2,1,4,3};
        System.out.println(findTheMinSubArrayLen(nums,7));
    }
}
