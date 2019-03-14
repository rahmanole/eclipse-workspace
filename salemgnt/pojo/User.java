/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;


public class User {
    private int id;
    private String name;
    private String userName;
    private String email;
    private Role role;
    private String mobile;
    private String pass;

    public User(String name, String userName, String email,Role role, String mobile,  String pass) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.role = role;
        this.pass = pass;
    }

    public User(int id, String name, String userName, String email, Role role,String mobile,  String pass) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.role = role;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
