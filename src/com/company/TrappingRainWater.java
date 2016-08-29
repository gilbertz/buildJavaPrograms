package com.company;

/**
 * Created by zhao on 16/7/23.
 */
public class TrappingRainWater {
    public static void main(String args[]){
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(new int[]{2,0,2}));
    }
    public int trap(int[] height) {
        if(height.length <2) return 0;
        int max= -1;
        int maxInd = 0;
        for(int i=0;i<height.length;i++){
            if(max<height[i])
            {
                max =height[i];
                maxInd =i;
            }
        }
        int area=0;
        int root=height[0];
        for(int i=0;i<maxInd;i++){
            if(root<height[i])
            {
                root=height[i];
            } else {
                area+=(root-height[i]);
            }
        }
        root =height[height.length-1];
        for(int i=height.length-1;i>maxInd;i--){
            if(root<height[i]) {
                root=height[i];
            }
            else {area+=(root-height[i]);}
        }
        return area;
    }
}
