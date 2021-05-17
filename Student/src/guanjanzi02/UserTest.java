package guanjanzi02;

/**
 * @author shkstart
 * @date 2021/5/14 - 22:22
 */
public class UserTest {
    public static void main(String[] args){
        User F1=new User();//创建一个对象且该值为默认值
        System.out.println(F1);
        F1.print();//调用print方法打印输出F1对象值
        F1.setName("ching");
        F1.print();
        System.out.println(F1.getName());
        String name = F1.getName();
        System.out.println(name);
        User F2=new User(5261,"小花");//创建一个新对象并且附上值
        F2.print();
        F2.setName("小明");//修改名字
        F2.setId(5445);//修改id
        F2.print();//打印输出修改值
    }
}
