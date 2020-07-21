package payrol.Implements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHALU
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHALU
 */

import java.sql.*;
public class conn {
    public Connection c;
    public Statement s;
    public PreparedStatement pst=null; 
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
                    c=DriverManager.getConnection("jdbc:mysql:///project3","root","");
                    s=c.createStatement();
            
        }catch(Exception e)
                {
               // e.printStackTrace();
                    System.out .print("not connected"+e);
                }
    }
    
    
}

