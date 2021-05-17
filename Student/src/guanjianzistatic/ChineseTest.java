package guanjianzistatic;

/**
 * @author shkstart
 * @date 2021/5/15 - 21:40
 */
public class ChineseTest{
    public static void main(String[] args){
        Chinese Fa=new Chinese();//创建对象

        Fa.id=2165;//修改id值

        Fa.name="张三";//修改name值

        System.out.println(Fa.id+","+Fa.name+","+Chinese.country);//访问Fa的数据

        Chinese Fb=new Chinese();//创建一个新对象

        Fb.id=6566;//修改id值

        Fb.name="李四";//修改name值

        System.out.println(Fb.id+","+Fb.name+","+Chinese.country);//访问Fb的数据

        Fb=null;//静态变量可以用类名.变量名，也可以用引用.变量名【但不建议】。

        System.out.println(Fb.country);//不会出现空指针异常，即使是null，也
        // 不会出现空指针异常，因为静态的数据不需要对象的存在

    }
}
