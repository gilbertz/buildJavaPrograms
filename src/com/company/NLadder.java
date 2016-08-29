package com.company;

/**
 * Created by zhao on 16/8/29.
 */
public class NLadder {
    public static void main(String args[]){
        int p=1,q=2,curr=0;
        int n = 5;
        for(int i=3;i<=n;i++){
            curr = p+q;
            p = q;
            q = curr;
        }
        System.out.println(curr);
    }
}
