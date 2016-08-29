package com.company;

/**
 * Created by zhao on 16/7/25.
 */
public class MSInterview2 {
    public static void main (String args[]){
        MSInterview2 main = new MSInterview2();
        boolean b = main.compare(new int[]{1,2,4,5,1,3,3});
    }

    public boolean compare(int []c){
        int h = c.length/2;
        int l = c.length;
        boolean res= false;
//        for(int i =0;i<l;i++){
            for(int j=0;j<h;j++){
                int tmp = c[j];
                c[j] = c[h-j];
                c[h-j] = tmp;

            };
            int sum1=0;
            int sum2=0;
            for(int k=0;k<h;k++){
                sum1+=c[k];
                sum2+=c[h-k];
            }
            if(sum1==sum2){
                res = true;
            }
//        }
        return res;
    }
}
