/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi.server;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;

/**
 *
 * @author intern1
 */
public class UserInfo implements Serializable  {
   private String userName;
   private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
