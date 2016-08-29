package com.company;

/**
 * Created by zhao on 16/7/23.
 */
public class JumpGameII {
    public static void main(String args[]){
        JumpGameII jumpGameII = new JumpGameII();
        int a= jumpGameII.jump(new int[]{2,3,1,1,4});
        System.out.println(a);
    }
    public int jump(int[] A) {
        int maxReach = A[0];
        int edge = 0;
        int minstep = 0;

        for(int i = 1; i < A.length; i++) {
            if (i > edge) {
                minstep += 1;
                edge = maxReach;
                if(edge > A.length - 1)
                    return minstep;
            }
            maxReach = Math.max(maxReach, A[i] + i);
        }

        return minstep;
    }
}
