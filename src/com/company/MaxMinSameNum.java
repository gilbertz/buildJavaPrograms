package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhao on 16/3/8.
 */
/*这道题目是intel第一轮现场面试的题目,题目是大数据部门一位年长的大佬给出的,具体是给出了一个有重复数字的数组,求出重复数字次数最少的数字,然
后从这些重复次数最小的数字中找出数字最小和最大.
 */
public class MaxMinSameNum {
    public static void maxMinSameNum(int [] a){
        if(a == null || a.length == 0) return;;
        HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();

        //遍历数组,统计数字的个数
        for(int n: a){
            if(!hash.containsKey(n)){
                hash.put(n,1);
            }else {
                hash.put(n,hash.get(n)+1);
            }
        }

        //找出重复次数最小的数字
        //// TODO: 16/3/8  
        int min = 65536;
        int max_num = -65536;
        int min_num = 65536;
        HashMap<Integer,Integer> hash2 = new HashMap<Integer, Integer>();
        for(Map.Entry<Integer,Integer> entry: hash.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }

        //装在重复次数最小的数字放入hash2
        for(Map.Entry<Integer,Integer> entry: hash.entrySet()) {
            if(entry.getValue() == min){
                hash2.put(entry.getKey(),entry.getValue());
            }
        }

        //找到hash2中的最大最小值
        for(Map.Entry<Integer,Integer> entry2: hash2.entrySet()) {
                if (entry2.getKey() >= max_num) {
                    max_num = entry2.getKey();
                }
                if (entry2.getKey() <= min_num) {
                    min_num = entry2.getKey();
                }
        }

        System.out.println("max_num:" + max_num);
        System.out.println("min_num:" + min_num);

    }

    public static void main(String [] args){
        int[] a = {1,2,3,4,5,1,2,6,8,-1,9,9,-2,-2,0};
        maxMinSameNum(a);
    }

}
