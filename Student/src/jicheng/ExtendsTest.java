package jicheng;

/**
 * @author shkstart
 * @date 2021/5/16 - 20:37
 */
public class ExtendsTest{//继承了Object类java中自带的
    public static void main(String[] args) {
        /*ExtendsTest F=new ExtendsTest();//这里编译通过了，这说明可以调用toString方
        // 法，ExtendsTest类中有toString方法，从Object类中继承过来的。
        String S=F.toString();
        System.out.println(S);
        */
        CreditAccount A=new CreditAccount();
        A.setActno("14525965599");
        A.setBalance(25485);//修改值
        A.setCredit(0.99);
        System.out.println(A.getActno()+","+A.getBalance()+","+A.getCredit());
        A.print();//调用一个静态方法



    }
}
