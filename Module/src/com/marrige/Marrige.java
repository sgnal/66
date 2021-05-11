package com.marrige;

/**
 * @author shkstart
 * @date 2021/5/10 - 22:33
 */
public class Marrige {
    public static void main(String[] args) {
        Husband j= new Husband();
        j.name="黄三";
        Wife w =new Wife();
        w.name="李四";
        w.h=j;
        j.u=w;
        System.out.println(w.h.name);
        //妻子丈夫的名字
        System.out.println(j.u.name);
        //丈夫妻子的名字

    }
}
