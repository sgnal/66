package MyTest;

/**
 * @author shkstart
 * @date 2021/5/12 - 12:55
 */
public class Test001 {
    private String name;

    private String addr;

    private String prodate;

    private String funciton;
    public void println(){
        System.out.println("名字:"+this.name+"地址:"+this.addr+"生产日期:"+this.prodate+"作用："+this.funciton);
    }
    public Test001(){



    }
    public Test001(String name,String addr,String prodate,String funciton){
        this.name=name;
        this.prodate=prodate;
        this.addr=addr;
        this.funciton=funciton;
    }
    public void setName(String name1){
        if(name1!="东鹏加氢"){
            System.out.println("您输入的商品有误");
            return;
        }
        name=name1;
    }


    public String getName(){

        return name;
    }
    public void setAddr(String addr1){
        if(addr1!="云浮"){
            return;
        }
        addr=addr1;
    }
    public String getAddr(){
        return addr;
    }

    public String getProdate() {
        return prodate;
    }
    public void setProdate(String prodate) {
        if(prodate!="07.25"){
            System.out.println("您输入的信息有误");
            return;
        }
        this.prodate = prodate;
    }

    public String getFunciton() {

        return funciton;
    }
    public void setFunciton(String funciton) {
        if(funciton!="提神醒脑，能量型营养素饮料"){
            System.out.println("您输出的结果有误");
            return;
        }
        this.funciton = funciton;
    }
}
