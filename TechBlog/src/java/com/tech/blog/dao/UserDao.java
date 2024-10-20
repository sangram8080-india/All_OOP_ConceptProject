/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sangram
 */
public class UserDao {
    
    private  Connection con ;
     
    public  UserDao(Connection con){
        this.con = con;
    }
    
    //method insert user database 
    
    public  boolean saveUser(User user){
        boolean f=false;
        try {
            
                String q = "insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
                PreparedStatement pstmt =this.con.prepareStatement(q);
                pstmt.setString(1, user.getName());
                pstmt.setString(2, user.getEmail());
                pstmt.setString(3, user.getPassword());
                pstmt.setString(4, user.getGender());
                pstmt.setString(5, user.getAbout());
                
                pstmt.executeUpdate();
                
                f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
    }
    
    //User Email and user Password
    
    public  User  getUserByEmailAndPassword(String email,String password){
        
        User user = null;
        try {
            
            String q= "selet * form user where email=? and password=?"; 
            
            PreparedStatement pstmt = this.con.prepareStatement(q);
            
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
             ResultSet set =pstmt.executeQuery();
             
             if(set.next()){
                 
                 user = new User();
                 String name = set.getString("name");
                 user.setName(name);
                 user.setId(set.getInt("id"));
                 user.setEmail(set.getString("email"));
                 user.setPassword(set.getString("password"));
                 user.setGender(set.getString("gender"));
                 user.setAbout(set.getString("about"));
                 user.setProfile(set.getString("profile"));
                 
                 
             }
            
            
            
            
        } catch (Exception e) {
        }
        
        return user;
    }
    
}
