package com.zjl.one;

/**
 * @author zjl
 */
public class Daffodils {

    static int getNNN(int n){ return n*n*n ; }
    public static void main(String[] args) {
        int singleDigit = 0;
        int tenDigits = 0;
        int hundredDigits = 0;
        int flag = 0;
        int[] result = new int[999];
        for (int i = 100; i < 1000; i++){
            singleDigit = i%10;
            tenDigits = (i/10)%10;
            hundredDigits = i/100;

            if((getNNN(singleDigit)+getNNN(tenDigits)+getNNN(hundredDigits))==i){
                result[flag] = i;
                flag++;
            }
        }

            for(int j = 0;j<flag;j++){
                System.out.println(result[j]);
            }




    }
}
