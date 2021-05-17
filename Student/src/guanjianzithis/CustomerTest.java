package guanjianzithis;

/**
 * @author shkstart
 * @date 2021/5/13 - 21:43
 */
public class CustomerTest {
    public static void main(String[] args){
//        创建对象
        Customer c1=new Customer();
//        修改名字
        c1.name="张三";
//        调用方法
        c1.shopping();
//        创建新对象
        Customer c2=new Customer();
        c2.name="李四";
        c2.shopping();
    }
}
