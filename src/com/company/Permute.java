package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by zhao on 16/7/25.
 */
public class Permute {
    public static void main(String args[]){
        Permute permute = new Permute();
        List list = new ArrayList<>();
        list = permute.permute(new int[]{1,2,3});
    }
    public List<List<Integer>> permute(int[] nums) {
        List res = new ArrayList<>();
        help(res,nums,0,nums.length-1);
        return res;
    }

    public void help(List res, int[] buff, int start, int end){
        if(start==end){
//            Integer [] i = new Integer[](buff);
//            Integer [] i  = (Integer[]) buff;
//            List<Integer> list = Arrays.asList(buff);/**/
            List<Integer> numbers = new ArrayList<Integer>();
            for(int i=0; i<buff.length; i++){
                numbers.add(buff[i]);
            }
            res.add(numbers);
        }else{
            for(int i=start;i<=end;i++){
                int tmp = buff[start];
                buff[start] = buff[i];
                buff[i] = tmp;
                help(res,buff,start+1,end);
                tmp = buff[start];
                buff[start] = buff[i];
                buff[i] = tmp;
            }
        }
    }
}
