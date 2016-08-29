package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhao on 16/7/25.
 */
public class Permutation {
    public static void main(String args[]){
        Permutation permutation = new Permutation();
        List<String> res = new ArrayList<String>();
        String string = "abc";
        char [] a = string.toCharArray();
        permutation.permute(res,a,0,2);
    }
    public void permute(List<String>res ,char[]buf, int start, int end) {
       if (start == end) {
           String string = String.valueOf(buf);
           res.add(string);
            } else {
            for (int i = start; i <= end; i++) {
                char temp = buf[start];
                buf[start] = buf[i];
                buf[i] = temp;
                permute(res,buf, start + 1, end);
                temp = buf[start];
                buf[start] = buf[i];
                buf[i] = temp;
                }
            }
    }
}
