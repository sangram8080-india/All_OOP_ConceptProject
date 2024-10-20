/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sangram
 */
public class ConnectionProvider {
    private static  Connection con;
    public  static  Connection getConnetion(){
        
            try {
                Thread.sleep(3000);
            
                 if(con==null){
                     
                     //Create a connetion 
                     Class.forName("com.mysql.jdbc.Driver");
                     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","");
                     
                 }
                
                
        } catch (Exception e) {
            e.printStackTrace();
        }
            return  con;
    }
    
}
