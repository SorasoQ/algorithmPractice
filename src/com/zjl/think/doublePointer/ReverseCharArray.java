package com.zjl.think.doublePointer;

public class ReverseCharArray {
    public String reverse(String target){
        char[] test = target.toCharArray();
        int left = 0;
        int right = test.length - 1 ;
        while (left < right){
            char temp = test[left];
            test[left] = test[right];
            test[right] = temp;
            left++;
            right--;
        }
        return new String(test);
    }
}
class TestReverse{
    public static void main(String[] args) {
        ReverseCharArray rca = new ReverseCharArray();
        String str = "Hello";
        System.out.println(rca.reverse(str));
    }
}