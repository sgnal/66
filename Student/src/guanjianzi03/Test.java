package guanjianzi03;

/**
 * @author shkstart
 * @date 2021/5/15 - 18:59
 */
public class Test {
    int i=10;
    public static void doSome(){
        System.out.println("do Some");
    }
    public void doOther(){
        System.out.println("do Other");
    }
    public static void method1(){
        Test.doSome();//使用完整方法调用doSome方法
        doSome();//使用省略方法调用doSome方法

        Test F2=new Test();//创建对象
        F2.doOther();//调用完整的doOther方法
        //调用省略的doOther方法

        int u=F2.i;
        System.out.println(u);//访问完整i变量

        System.out.println();

    }
    public void method2(){
        Test.doSome();
        doSome();


        this.doOther();//使用完整方式调用doOther
        doOther();//使用省略方式调用doOther

        System.out.println(this.i);//使用完整方式访问i
        System.out.println(i);//使用省略方式访问i

    }
    public static void main(String[] args){
        Test.method1();//完整方法调用method1
        method1();//省略方法调用method1

        Test F1=new Test();//创建对象
        F1.method2();//使用完整方法调用method2方法
        //使用省略方法调用method2方法


    }

}
