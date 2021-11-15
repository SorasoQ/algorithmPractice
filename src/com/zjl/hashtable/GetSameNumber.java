package com.zjl.hashtable;

import java.util.HashSet;

/**
 * @author zjl
 */
public class GetSameNumber {
    public int[] intersection(int[] temp01,int[] temp02){
        HashSet<Integer> record = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i : temp01){
            record.add(i);
        }
        for (int i : temp02){
            if (record.contains(i)){
                result.add(i);
            }
        }
        int[] rs = new int[result.size()];
        int index = 0;
        for (int i : result){
            rs[index++] = i;
        }
        return rs;
    }
}
class TestGetSameNumber{
    public static void main(String[] args) {
        GetSameNumber gsn = new GetSameNumber();
        int[] target = {1,2,2,1};
        int[] temp = {2,2};
        int[] rs = gsn.intersection(target,temp);
        for (int i: rs
             ) {
            System.out.println(i);
        }
    }
}
