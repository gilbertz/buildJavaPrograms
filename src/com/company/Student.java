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

    //将键盘中的输入送到输入流里,在把输入流阅读器放到缓冲里
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);


    public Student(String i,String n,int a){
        sid = i;
        sname = n;
        sage = a;
    }

    public Student() throws IOException{
        System.out.print("请输入学号:");
        sid = br.readLine();
        System.out.print("请输入姓名:");
        sname = br.readLine();
        System.out.print("请输入年龄:");
        sage = Integer.parseInt(br.readLine());//将键盘的输入的字符串转化成整数
    }

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

    protected final void  finalize(){
        System.out.println("sid="+sid);
        System.out.println("sname="+sname);
        System.out.println("sage="+sage);
    }

    public static void main(String [] args) throws IOException{
        Student s1 = new Student();
//        s1.input("s01","李小龙",32);
        s1.judge();
        s1.output();
        Student s2 = new Student("s02","张三丰",45);
        s2.judge();
        s2=null;
        System.gc();//使用gc来调用finalize函数,finalize无法控制执行流程

    }
}
