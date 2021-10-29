package com.zjl.one;

/**
 * @author zjl
 */
public class PrimeFactors {


    static String getPrimeFactors(int n){
        int k = 2;
        StringBuilder str = new StringBuilder();
        if(n < k){
            str.append("Error!"); return str.toString();}
        else {
            while (k<n){
                if( n%k==0 ){
                    str.append(k).append("*");
                    n = n/k;
                }else{
                    k+=1;
                }
                if(k==n)
                {
                    str.append(k);
                }
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {

        System.out.println(getPrimeFactors(200));



    }
}
