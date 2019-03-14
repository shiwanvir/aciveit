/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javarmi.server.RemoteInterface;

/**
 *
 * @author shiwantha
 */
public class RemoteClient {
    private  static RemoteInterface si;
    
    static {
        
         try {
            String luckupString="rmi://localhost:1212/MyServer";
            si=(RemoteInterface) Naming.lookup(luckupString);
         
        } catch (NotBoundException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] argsi)  {
       
    }

    public static RemoteInterface getSi() {
        return si;
    }

    public static void setSi(RemoteInterface aSi) {
        si = aSi;
    }
}
