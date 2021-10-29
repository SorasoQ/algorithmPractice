package com.zjl.one;

import java.lang.reflect.Array;

/**
 * @author zjl
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int cunt = 0;
        int flag = 0;
        int []result = new int[100];
        for(int i=101;i <= 200;i++){
            flag = 0;
            for(int j = 2;j<=i;j++){
                if (i%j==0){ flag++;}
            }
            if(flag==1){result[cunt] = i;cunt++;}
        }
        System.out.println("共有"+ cunt +"个质数，分别是：");
        for(int t = 0;t < cunt;t++){
            System.out.println(t+":"+result[t]);
        }
    }

}
