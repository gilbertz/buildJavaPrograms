package com.company;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by zhao on 16/7/23.
 */
public class CombinationSumII {
    public static void main(String args[]){
        int [] c = {2,3,6,7};
        CombinationSumII combinationSumII = new CombinationSumII();
        List<List<Integer>> s = combinationSumII.combinationSum2(c,7);
        System.out.println(s);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> rs = new ArrayList<List<Integer>>();
        help(rs,new ArrayList<>(),candidates,target,0,0);
        return rs;
    }
    private void help(List<List<Integer>> rs,List<Integer> s,int[] c,int t,int sum,int start){
        if(sum == t){
            List<Integer> ss = new ArrayList<Integer>(s);
            Collections.sort(ss);
            if (!rs.contains(ss))
            rs.add(ss);
            return;
        }
        if(sum>t){
            return;
        }
        for(int i=start;i<c.length;i++){
            s.add(c[i]);
            help(rs,s,c,t,sum+c[i],i+1);
            s.remove(s.size()-1);
        }
    }
}
