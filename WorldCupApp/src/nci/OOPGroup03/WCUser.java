/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nci.OOPGroup03;

import java.io.Serializable;

/**
 *
 * @author niall
 */
public class WCUser implements Serializable {
    
    public String userName;
    private String password;
    
    WCUser(String name) {
        this.userName = name;
    }
    
}
