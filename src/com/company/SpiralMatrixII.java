package com.company;

/**
 * Created by zhao on 16/7/31.
 */
public class SpiralMatrixII {
        public static void main(String args[]){
            SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
            spiralMatrixII.generateMatrix(3);
        }
        public int[][] generateMatrix(int n) {
            int [][] ret = new int[n][n];
            if(n == 1){return new int[][]{{1}};};
            int top = 0;
            int bottom = n-1;
            int left = 0;
            int right = n-1;
            int j = 1;
            while(true){
                for(int i = left;i<=right;i++){
                    ret[top][i] = j;
                    j++;
                }
                top++;
                if(left>right || top>bottom) return ret;
                for(int i = top;i<=bottom;i++){
                    ret[i][right] = j;
                    j++;
                }
                right--;
                if(left>right || top>bottom) return ret;
                for(int i = right;i>=left;i--){
                    ret[bottom][i] = j;
                    j++;
                }
                bottom--;
                if(left>right || top>bottom) return ret;
                for(int i = bottom;i>=top;i--){
                    ret[i][left] = j;
                    j++;
                }
                left++;
                if(left>right || top>bottom) return ret;
            }
        }
}
