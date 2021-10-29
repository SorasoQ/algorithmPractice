package com.zjl.think.sum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zjl
 */
/**
 * 双指针遍历
 */
public class GetSum {
    static int[] sumOfTwo(int []arr, int target){
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i<arr.length;i++){
            if (resultMap.containsKey(target-arr[i])){
                result[0]=resultMap.get(target-arr[i]);
                result[1]=i;
                return result;
            }
           else{ resultMap.put(arr[i],i);}
        }
       return result;
    }

    public static void main(String[] args) {
        int sources[]={1,2,3,6,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sumOfTwo(sources,target)));
    }
}
