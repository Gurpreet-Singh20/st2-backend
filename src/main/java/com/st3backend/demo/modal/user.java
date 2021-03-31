package com.st3backend.demo.modal;
import javax.persistence.*;

@Table(name="st2")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="mobno")
    private Integer mobno;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;


    public Integer getMobno() {
        return mobno;
    }

    public void setMobno(Integer mobno) {
        this.mobno = mobno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
