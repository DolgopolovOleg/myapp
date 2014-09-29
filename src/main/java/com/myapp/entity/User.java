package com.myapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "users")
public class User {

    @Id
    @Column (name = "_id")
    @GeneratedValue
    private int _id;

    @Column (name = "name")
    private String name;

    @Column (name = "sname")
    private String sname;

    @Column (name = "nickname")
    private String nickname;

    @Column (name = "phone")
    private String phone;

    @Column (name = "email")
    private String email;

    public User() {
    }

    public User(String name, String sname, String nickname, String phone, String email) {
        this.name = name;
        this.sname = sname;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
