package com.fengzhuang;

/**
 * @author shkstart
 * @date 2021/5/10 - 23:26
 */
public class Customer {
    private int age;

    private String name;

    private String addr;

    private boolean sex;
    public void setAge(int a){
        if(a<0||a>100){
            System.out.println("对不起，您提供的年龄不合法");
            return;
        }
        age=a;
    }
    public int getAge(){

        return age;
    }
}
