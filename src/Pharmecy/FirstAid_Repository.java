/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmecy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author java2
 */
class FirstAid_Repository {

    public FirstAid_Repository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(FirstAid_Repository.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("class not found"+ex.getMessage());
        }
    }
   public ArrayList<FirstAid> loadFirstAid(){
   ArrayList<FirstAid> firstaid= new ArrayList<FirstAid>();
   
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sohag","root","");
            
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery("Select id,diseasesName,diseasesExtension,test,medicine From FirstAid");
            while(result.next()){
            firstaid.add(new FirstAid(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
            
            
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
           // Logger.getLogger(FirstAid_Repository.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("loat first"+ex.getMessage());
        }
       
   
   return firstaid;
   } 
}
