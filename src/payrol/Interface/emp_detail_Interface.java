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
public interface emp_detail_Interface extends Remote {
  
public boolean ins_empdetail(String name,String category,String religion,String acct,String mqualify,String fqualify,String squalify,String branch,String dept,String desg,String d,String gender,String nationality,String dj,String dr,String mob,String em,String cad,String fname,String mname,String marital,String sname,String child,String qualify,String adhar,String pan,String pad)throws RemoteException;
}