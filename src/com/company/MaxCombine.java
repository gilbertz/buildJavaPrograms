package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhao on 16/3/8.
 */
/*这个又是一道intel实习生的面试题目,题目是给出一个数组,里面的数字是多位数,求出这些多位数字组合起来的最大数字,比如给个数组[7,354,23,589],
    得到的最大数字为758935423.这道题目的解法是我们可以将这些数字看成是数字字符串,然后对两个数字字符串指针循环比较,循环的次数是两个字符串
    的长度和,循环结束的调节是指针所指的字符不同或达到了循环次数
    */
public class MaxCombine {
    public static String maxCombine(String[] input){
        Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0;i < o1.length() + o2.length();i++){
                    char p = o1.charAt(i % o1.length());
                    char q = o2.charAt(i % o2.length());
                    if(p != q) return q-p;
                }
                return 0;
            }
        });

        String result = "";
        for (String s : input) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args){
        String[] test = {"7","354","35","23","589"};
        System.out.println(maxCombine(test));
    }
}
