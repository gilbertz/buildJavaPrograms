package com.company;
import java.lang.*;
import java.io.*;
/**
 * Created by zhao on 16/4/9.
 */

public class Student{
    private String sid;
    private String sname;
    private int sage;

    public void input(String i,String n,int a){
        sid =i;
        sname = n;
        sage = a;
    }

    public void judge(){
        if(sage>60){
            System.out.println("您年纪太大了！");
        }else{
            System.out.println("您年纪适当！");
        }
    }

    public void output(){
        System.out.println("sid="+sid);
        System.out.println("sname="+sname);
        System.out.println("sage="+sage);
    }

    public static void main(String [] args){
        Student s1 = new Student();
        s1.input("s01","李小龙",32);
        s1.judge();
        s1.output();

    }
}
