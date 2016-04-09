package com.company;
import java.lang.*;
import java.io.*;
import javax.swing.*;
/**
 * Created by zhao on 16/4/9.
 */

public class Student{
    private String sid;
    private String sname;
    private int sage;

    //将键盘中的输入送到输入流里,在把输入流阅读器放到缓冲里
//    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//换用匿名类对象

    public Student(String i,String n,int a){
        sid = i;
        sname = n;
        sage = a;
    }

    public Student(){
        sid = JOptionPane.showInputDialog(null,"请输入学号","输入学号",JOptionPane.QUESTION_MESSAGE);
        sname = JOptionPane.showInputDialog(null,"请输入姓名","输入姓名",JOptionPane.QUESTION_MESSAGE);
        sage = Integer.parseInt(JOptionPane.showInputDialog(null,"请输入年龄","输入年龄",JOptionPane.QUESTION_MESSAGE));

    }

    public void input(String i,String n,int a){
        sid =i;
        sname = n;
        sage = a;
    }

    public String judge(){
        if(sage>60){
            return "您年纪太大了！";
        }else{
            return "您年纪适当！";
        }
    }

    public void output(){
        JOptionPane.showMessageDialog(
                null,
                judge()+"\n" +
                        "sid="+sid+"\n"+
                        "sname"+sname+"\n"+
                        "sage"+sage+"\n","学生信息",JOptionPane.INFORMATION_MESSAGE);
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
