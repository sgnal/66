package guanjianzistatic;

/**
 * 数学工具类【加static方便调用方法不用new对象】
 * @author shkstart
 * @date 2021/5/16 - 20:19
 */
public class MathUtil {
    public static void main(String[] args) {
        System.out.println(MathUtil.sumInt(10, 20));
        System.out.println(MathUtil.divide(24, 4));
    }
    public static int sumInt(int i,int b){
        return i+b;
    }
    public static int divide(int i,int b){
        return i/b;
    }
}
