package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @date 2021/5/9 - 14:52
 */
public class TemplatesTest {
    //模板：prsf:可生成private static final
    private static final customer CUST=new customer();
    //上模板变形：psf
    public static final int NUM=1;//大小写转换ctrl+shirt+u
    //变形：psfi
    public static final int NUM01=5;
    //变形：psfs
    public static final String NATION="中国";




    //模板
    //模板一：psvm或main
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("HelloWorld");

        //变量【拓展】：soutp【打印形式参数】
        System.out.println("args = " + Arrays.deepToString(args));
        //soutv【打印变量值】(根据就近原则选择变量)
        int i1 = 10;
        System.out.println("i1 = " + i1);
        int i2 = 20;
        System.out.println("i2 = " + i2);

        //xxx.sout【拓展】
        System.out.println(i2);


        System.out.println("args = " + Arrays.toString(args));
        //soutm【打印方法】
        System.out.println("TemplatesTest.main");
        //fori【for循环】
        String[] arr = new String[]{"tom", "jeey", "lomf"};//数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(i);
        }

            //iter【for循环增强版】
            for (String s : arr) {
                System.out.println(s);

            }
            //itar【变形】
            for (int j = 0; j < arr.length; j++) {
                String s = arr[j];
                System.out.println("s = " + s);

            }

        }
        public static void method () {
            System.out.println("TemplatesTest.main");
            //ifn【模板五】
            ArrayList list = new ArrayList();

            if (list == null) {

            }
            //变形：inn【不等于】
            if (list != null) {

            }
            //变形：xx.null或xx.nn
            if (list == null) {

            }
            if (list != null) {

            }


        }
    }