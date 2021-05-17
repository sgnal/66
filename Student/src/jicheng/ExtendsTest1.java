package jicheng;

/**
 * @author shkstart
 * @date 2021/5/16 - 21:57
 */
public class ExtendsTest1 {
    public static void main(String[] args){
        C c=new C();
        c.doSome();//继承的是B的java语句
    }

}
class A{
    public void doSome(){
        System.out.println("do Some");
    }
}
class B extends A{
    public void doSome(){
        System.out.println("-------do Other--------");//-------do Other--------
    }

}
class C extends B{

}
