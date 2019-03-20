/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author ccsl-pc
 */
public class Supplier {
    private int id;
    private String name;
    private String email;
    private String cntNumber1;
    private String cntNumber2;
    private String address;

    public Supplier(int id, String name, String email, String cntNumber1, String cntNumber2, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cntNumber1 = cntNumber1;
        this.cntNumber2 = cntNumber2;
        this.address = address;
    }

    public Supplier(String name, String email, String cntNumber1, String cntNumber2, String address) {
        this.name = name;
        this.email = email;
        this.cntNumber1 = cntNumber1;
        this.cntNumber2 = cntNumber2;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCntNumber1() {
        return cntNumber1;
    }

    public void setCntNumber1(String cntNumber1) {
        this.cntNumber1 = cntNumber1;
    }

    public String getCntNumber2() {
        return cntNumber2;
    }

    public void setCntNumber2(String cntNumber2) {
        this.cntNumber2 = cntNumber2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
