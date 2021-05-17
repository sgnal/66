package jicheng;

/**
 * @author shkstart
 * @date 2021/5/16 - 20:35
 */
public class Account {
    private String actno;//账号
    private double balance;//余额

    public void print(){
        System.out.println("卡号："+this.actno+"余额："+this.balance);
    }

    public Account() {
    }

    public Account(String actno,double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
