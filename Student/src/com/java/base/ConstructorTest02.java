package com.java.base;

/**
 * @author shkstart
 * @date 2021/5/12 - 20:19
 */
public class ConstructorTest02 {
    public static void main(String[] args){
        ConstructorTest02Acount f1=new ConstructorTest02Acount();
       System.out.println("余额"+f1.getBalance());
       System.out.println("账户"+f1.getAuto());
        ConstructorTest02Acount f2=new ConstructorTest02Acount(1001494);
        System.out.println("余额"+f2.getBalance());
        ConstructorTest02Acount f3=new ConstructorTest02Acount("26489484564654");
        System.out.println("账户"+f3.getAuto());
        ConstructorTest02Acount f4=new ConstructorTest02Acount("948646556161",52489);
        System.out.println("账户"+f4.getAuto());
        System.out.println("余额"+f4.getBalance());
    }
}
