package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhao on 16/7/23.
 */
public class RotateImage {
    public static void main(String args[]){
        RotateImage rotateImage = new RotateImage();
        int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(a);
        System.out.println(a);
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i=0; i<n/2; i++){
            for (int j=i; j<n-i-1; j++) {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=tmp;
            }
        }
    }

}
