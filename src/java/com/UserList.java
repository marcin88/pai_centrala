/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcin
 */
@XmlRootElement(name = "users")
public class UserList {
    
  
    List<User> usersList;
  
@XmlElement(name = "user")
    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public String toString() {
        return "UserList{" + "usersList=" + usersList + '}';
    }

    
    
    
   
    

    
    
    
    
}
