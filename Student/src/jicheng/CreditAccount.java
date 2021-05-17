package jicheng;

/**
 * @author shkstart
 * @date 2021/5/16 - 20:36
 */
public class CreditAccount extends Account{
    private String actno;//账号
    private double balance;//余额
    private double credit;//信用分

   public CreditAccount(String actno,double balance,double credit){
       this.actno=actno;
       this.balance=balance;
       this.credit=credit;

   }

    public CreditAccount() {

    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

}
