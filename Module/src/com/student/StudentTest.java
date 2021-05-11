package com.student;

/**
 * @author shkstart
 * @date 2021/5/10 - 22:05
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象
        Student u = new Student();
        //访问该学生属性
        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.addr);
        System.out.println(u.addr);
        System.out.println(u.sex);
        System.out.println("==========================================");
        //修改学生属性数据
        u.addr="中国";
        u.sex=false;
        u.name="ljjl";
        u.age=548;
        u.no=45487;
        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.sex);
        System.out.println(u.age);
        System.out.println(u.addr);
    }





}
