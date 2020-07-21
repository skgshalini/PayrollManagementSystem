/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol.Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import payrol.Implements.emp_detail_Implements;

/**
 *
 * @author SHALU
 */
public class emp_detail_server {
    public static void main(String[] args)
    {
        try{
            
            Registry reg=LocateRegistry.createRegistry(1096);
            emp_detail_Implements o=new emp_detail_Implements();
            reg.rebind("emp_detail_insert",o);
            System.out.println("server ready");
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
}
