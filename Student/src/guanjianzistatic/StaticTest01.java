package guanjianzistatic;

/**
 * @author shkstart
 * @date 2021/5/16 - 18:57
 */
public class StaticTest01 {
//    静态代码块语法
//    static{
//      java语句;
//    }
    static{
        System.out.println("类加载"+"-->1");
    }
    static{
        System.out.println("累加载"+"-->2");
    }
    static{
        System.out.println("类加载"+"-->3");
    }
    public static void main(String[] args){
        System.out.println("main begin");
    }
}
