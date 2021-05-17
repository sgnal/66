package com.java.base;

/**
 * @author shkstart
 * @date 2021/5/12 - 20:21
 */
public class ConstructorTest02Acount {
//    构造方法
    public ConstructorTest02Acount(){

    }
//    构造方法
    public ConstructorTest02Acount(String a){
        auto=a;
    }
//    构造方法
    public ConstructorTest02Acount(double b){
        balance=b;
    }
    public ConstructorTest02Acount(String a,double b){
        auto =a;
        balance =b;
    }
    //    账户
    private String auto;
//auto的封装
    public String getAuto() {
        return auto;
    }
    public void setAuto(String auto) {
        this.auto = auto;
    }
    //    余额
    private double balance;
//balance的封装
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
