/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol.Interface;
import java.rmi.*;
/**
 *
 * @author SHALU
 */
public interface Project_Interface extends Remote {
    public boolean getLogin(String user,String pass) throws RemoteException;   
}
