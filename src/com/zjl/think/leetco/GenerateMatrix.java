package com.zjl.think.leetco;
import java.util.Arrays;

/**
 * @author zjl
 */
public class GenerateMatrix {
    private static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        int loop = n/2;
        //如果是单数需要单独给中间格子赋值
        int mid = n/2;

        int offset = 1;

        int count = 1;

        int startX = 0;
        int startY = 0;

        while(loop > 0){
            int i = startX;
            int j = startY;
            //上方循环
            for (; j < startY + n - offset; j++) {
                matrix[i][j] = count++;
            }
            //右侧循环
            for (; i < startX + n - offset; i++) {
                matrix[i][j] = count++;
            }
            for (;j > startY; j--){
                matrix[i][j] = count++;
            }
            for (;i > startX; i--){
                matrix[i][j] = count++;
            }

            startX++;
            startY++;
            offset += 2;
            loop--;
        }
        if (n%2 == 1){
            matrix[mid][mid] = count;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}
