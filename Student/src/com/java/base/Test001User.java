package com.java.base;

/**
 * @author shkstart
 * @date 2021/5/12 - 19:39
 */
public class Test001User {
//    构造方法的重载
//    构造方法的语句为
//    【修饰符列表】方法名(形式参数列表){}
//    普通方法的语句为
//    【修饰符列表】返回值类型 方法名(形式参数列表){}
    public Test001User(){
        System.out.println("method detulb‘s invoke");
    }
    public Test001User(int a){
        System.out.println("调用int类型的数据类型");
    }
    public Test001User(String b){
        System.out.println("调用String类型的数据类型");
    }

}
