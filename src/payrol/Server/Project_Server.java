/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol.Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import payrol.Implements.project_Implements;

/**
 *
 * @author SHALU
 */
public class Project_Server {
    public static void  main(String args[])
    {
          try{
    Registry reg=LocateRegistry.createRegistry(1099);
    project_Implements p=new project_Implements();
    reg.rebind("login",p);
    System.out.println("SERVERR IS READY");
    }catch(Exception e)
    {
        e.printStackTrace();
    }
  
}
}
