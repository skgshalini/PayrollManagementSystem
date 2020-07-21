/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol.Implements;

//import Admin;
//import conn;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import payrol.Interface.Project_Interface;

/**
 *
 * @author SHALU
 */
public class project_Implements extends UnicastRemoteObject implements Project_Interface {
    public project_Implements()throws RemoteException{}
    
     public boolean getLogin(String user,String pass) throws RemoteException
     {
         boolean f=false;
       try
        {
            conn c1=new conn();
            String u=user;
            String v=pass;
                     String q="select * from login where user='"+u+"' and pass='"+v+"'";
            
            ResultSet rs=c1.s.executeQuery(q); // query execute
            if(rs.next()){
              return f=true;
            }   
        }catch(Exception e){
            e.printStackTrace();
        }
        return  f=false;
     }
    
}
