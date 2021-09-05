/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class studetninfo {

    private int idd;
    private String name;
    private String email;
    private String mobile;

    public studetninfo() {
    }

    public studetninfo(int idd, String name, String email, String mobile) {
        this.idd = idd;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
    

    

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "studetninfo{" + "idd=" + idd + ", name=" + name + ", email=" + email + ", mobile=" + mobile + '}';
    }

}
