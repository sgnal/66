package guanjanzi02;

/**
 * @author shkstart
 * @date 2021/5/14 - 22:14
 */
public class User {

    private int id;

    private String name;

    public User(){
        this(541445,"jack");

    }
    public User(int id,String name){
        this.id=id;
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void print(){
        System.out.println("卡号:"+this.id+"姓名:"+this.name);
    }
}
