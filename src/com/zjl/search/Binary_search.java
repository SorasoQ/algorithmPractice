package com.zjl.search;

public class Binary_search {
    public static int solution(int[]nums,int target){
        if(target<nums[0]||target>nums[nums.length-1]){return -1;}

        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + ((right - left) >> 1);
                if(nums[mid] == target){
                    return mid;
                }else if (nums[mid] < target){
                    left = mid + 1;
                }else if (nums[mid] > target){
                    right = mid -1;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(solution(nums,10));
    }
}
