/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author shiwantha
 */
public interface RemoteInterface extends Remote {
    public void setName(String name)throws RemoteException;
    public String getName() throws RemoteException;
    public String getDetatils()throws RemoteException;
    public String login(UserInfo info)throws RemoteException;
    public String Signup(UserInfo signup)throws RemoteException;
    public GoalSteps analyseData(UserDetails details)throws RemoteException;
   
    
    
}
