package com.zjl.think.recursive;

import java.util.Scanner;

/**
 * @author zjl
 */
public class Mypow {

    static double quikPow(double x,int n){
        double result =1.0;
        int nCopy = n;
        if(n==0){return result;}
            while(nCopy!=0){
                if(nCopy%2 == 1){
                    result*=x;
                }
                x *= x;
                nCopy/=2;
            }
        if(n<0){return 1/result;}
        else{return result;}

    }

    public static void main(String[] args) {
        System.out.println(quikPow(2,-2));
    }
}
