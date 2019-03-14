/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javarmi.server.UserDetails;

/**
 *
 * @author Sangeev95
 */
public class InformationGatheredBundle {
  private static UserDetails userdetails; 

    public static UserDetails getUserdetails() {
        return userdetails;
    }

    public static void setUserdetails(UserDetails aUserdetails) {
        userdetails = aUserdetails;
    }
}
