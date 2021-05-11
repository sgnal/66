package com.user;

/**
 * @author shkstart
 * @date 2021/5/10 - 22:50
 */
public class UserTest {
    public static void main(String[] args) {
        //创建User对象
        User user = new User();

        System.out.println("该用户年龄为"+user.age);

        user.age=17;

        System.out.println("该用户年龄为"+user.age);

        user.age=-100;
        //这里的age属性显然是完全暴露给外部程序的，对于程序员来说可以操作User对象中所有的细节，
        //导致User中部分数据不安全，建议对User对象进行封装，这样就不能再外部程序中随意访问User对象中的属性
        //这样便可以保证该对象的安全
        System.out.println("该用户年龄为"+user.age);
    }
}
