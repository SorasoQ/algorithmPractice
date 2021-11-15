package com.zjl.hashtable;

import java.util.HashSet;

/**
 * @author zjl
 */
public class IsHappyNum {
    public boolean isHappyNum(int n){
        HashSet<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    public int getNext(int n){
        int rs = 0;
        while (n > 0){
            int temp = n % 10;
            rs += temp * temp;
            n = n/10;
        }
        return rs;
    }
}
class TestHappyNum{
    public static void main(String[] args) {
        IsHappyNum test = new IsHappyNum();
        System.out.println(test.isHappyNum(19));
    }
}
