/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author DIGETI
 */
public class DB {

String driver = "org.postgresql.Driver";
String connectString = "jdbc:postgresql://localhost:5432/prueba";
String user = "postgres";
String password = "system";
static Connection con;
static Statement stmt;
public DB(){
        try{
            Class.forName(driver);
             con = DriverManager.getConnection(connectString, user , password);
             stmt = con.createStatement();    

        }

        catch ( Exception e ){
            System.out.println(e.getMessage());
        }
}
    
}
