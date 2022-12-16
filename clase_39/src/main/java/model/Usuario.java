/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author jose
 */
public class Usuario {
    private String username;
    private String password;
    private String name;
    private String last_name;
    private String email;
    private Date signup_date;
    
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
        this.signup_date = new Date();
    }
    
    public Usuario(String username, String password, String name, String last_name, String email){
        this.username = username;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.signup_date = new Date();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSignup_date() {
        return signup_date;
    }

}
