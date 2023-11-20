package com.ashokIT.bindings;

public class User
{
    private Integer uid;
    private String uname;
    private String mail;

    public  User(){}

    public User(Integer uid, String uname, String mail) {
        this.uid = uid;
        this.uname = uname;
        this.mail = mail;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
