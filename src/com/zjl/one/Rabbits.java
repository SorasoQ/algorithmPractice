package com.zjl.one;

/**
 * @author zjl
 */
public class Rabbits {

    static int getTheNum(int n){
        int temp1,temp2 = 1;
        if(n<3){return 1;}
        else {
            return getTheNum(n-2)+getTheNum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(2*getTheNum(10));
    }
}
