package com.zjl.think;

public class Test {

        public static double calAverageScore(double[] scores) {
            // write code here
            int length = scores.length;
            double max = scores[0];
            double min = scores[0];
            double sum = 0;
            int flag01 = 0;
            int flag02 = 0;
            for(int i=0;i<length;i++){
                if(max < scores[i]){
                    max = scores[i];
                    flag01 = i;
                }
                if(min > scores[i]){
                    min = scores[i];
                    flag02 = i;
                }
            }
            for(int j = 0;j<length;j++){
                if((j!=flag01)&&(j!=flag02)){

                    sum += scores[j];
                }
            }
            return(sum/(length-2));
        }

    public static void main(String[] args) {
        double scores[] = {98.0,99.0,80.0,75.0,60.0};
        System.out.println(calAverageScore(scores));
    }
}
