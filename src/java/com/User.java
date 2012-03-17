/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcin
 */
@XmlRootElement(name = "user")
public class User {

    //@XmlElement(name = "name")
    String namea;
    
   // @XmlElement(name = "address")
    String addressa;

    public String getName() {
        return namea;
    }

    public void setName(String name) {
        this.namea = name;
    }

    public String getAddress() {
        return addressa;
    }

    public void setAddress(String address) {
        this.addressa = address;
    }

    public User(String namea, String addressa) {
        this.namea = namea;
        this.addressa = addressa;
    }

  public User(){};

    @Override
    public String toString() {
        return "User{" + "namea=" + namea + ", address=" + addressa + '}';
    }
    
    
    
    
}
