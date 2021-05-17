package guanjianzistatic;

/**
 * @author shkstart
 * @date 2021/5/16 - 19:41
 */
public class StaticTest02 {
    public StaticTest02(){
        System.out.println("缺省构造器");
    }
//    实例代码块
    {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    {
        System.out.println(3);
    }
    public static void main(String[] args){
        System.out.println("你好！");
        new StaticTest02();
        new StaticTest02();
    }//先执行主方法的再实例变量再构造方法
}
