package guanjianzi;

/**
 * @author shkstart
 * @date 2021/5/15 - 20:24
 */
public class Test {
    public static void main(String[] args){
        Test.doSome();
        doSome();

        Test F=new Test();
        F.doSome();

        F=null;
        F.doSome();
    }
    public static void doSome(){
        System.out.println("do Other");

    }
    public void doOther(){

    }
}
