package parameter.passing;

/**
 * @author shkstart
 * @date 2021/5/13 - 21:18
 */
public class Test2 {
//    参数传递--2
    public static void main(String[] args){
        Test02 t=new Test02(10);
        add(t);
        System.out.println(t.age);
    }
    public static void add(Test02 t){
        t.age++;
        System.out.println(t.age);
    }
}
