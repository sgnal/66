package com.java.base;

/**
 * @author shkstart
 * @date 2021/5/12 - 21:19
 */
public class Customer003 {
    public Customer003(String a,String b,String c) {
        name=a;
        addr=b;
        email=c;
    }

    private String name;

    private String addr;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
