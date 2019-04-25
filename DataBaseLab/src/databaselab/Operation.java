/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaselab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Operation {
    
    private DBConnect dbc;
    private ResultSet rs; 
    
    public void FromDB(Constractor cnt) throws ClassNotFoundException
            
    {  
        System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
         String pn = cnt.productName();
         int id = cnt.productID();
         int product_quantity=cnt.ProductQuan();
        
         System.out.println("ProductName "+ pn);
         System.out.println("ProductID "+ id);
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
          Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=database_lab;integratedSecurity=true");  
          Statement statement = connection.createStatement(); 
          
         // ResultSet rs = statement.executeQuery("SELECT * FROM Product_Details where product_id=cnt.productID()");
         
          
         dbc.disconnectFromDB();            
     }
                   
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}

    } 
    
        
 private void closeDB()
{
    try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}
    
}
