/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol.Implements;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;
import payrol.Interface.emp_detail_Interface;

/**
 *
 * @author SHALU
 */
public class emp_detail_Implements extends UnicastRemoteObject implements emp_detail_Interface {
    
    public emp_detail_Implements() throws RemoteException{}
  public boolean ins_empdetail(String name,String category,String religion,String acct,String mqualify,String fqualify,String squalify,String branch,String dept,String desg,String d,String gender,String nationality,String dj,String dr,String mob,String em,String cad,String fname,String mname,String marital,String sname,String child,String qualify,String adhar,String pan,String pad)throws RemoteException
  {
boolean f=false;
 String qry="insert into update_employee values(null,'"+name+"','"+category+"','"+religion+"','"+acct+"','"+mqualify+"','"+fqualify+"','"+squalify+"','"+branch+"','"+dept+"','"+desg+"','"+d+"','"+gender+"','"+nationality+"','"+dj+"','"+dr+"','"+mob+"','"+em+"','"+cad+"','"+fname+"','"+mname+"','"+marital+"','"+sname+"','"+child+"','"+qualify+"','"+adhar+"','"+pan+"','"+pad+"')";
           
               try{
                   
                  // name, category,religion, acct, mqualify,fqualify,squalify, branch,dept,desg,d,gender, nationality, dj,dr,mob,em,cad, fname, marital,sname,child, qualify, adhar, pan, pad);
                conn c1 = new conn();
                  
                 c1.s.executeUpdate(qry);
                // JOptionPane.showMessageDialog(null,"Error1");
                return f=true;
                // JOptionPane.showMessageDialog(null,"Employee salary Added");
            }catch(Exception ee){
                ee.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error");
            }                  
               
    return f=false;
   // public boolean ins_empdetail(String name,String category,String religion,String acct,String mqualify,String fqualify,String squalify,String branch,String dept,String desg,String d,String gender,String nationality,String dj,String dr,String mob,String em,String cad,String fname,String marital,String sname,String child,String qualify,String adhar,String pan,String pad)throws RemoteException


}
    
    
}
