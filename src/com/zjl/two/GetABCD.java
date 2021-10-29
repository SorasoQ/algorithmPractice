package com.zjl.two;


import java.util.Scanner;

/**
 * @author zjl
 */


public class GetABCD {

    static String getTheScore(int n){
        if(n>=90){return "A"; }
        else if(n>=60){return "B";}
        else {return "C";}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        String theScore = getTheScore(score);
        System.out.println(theScore);
    }

}
