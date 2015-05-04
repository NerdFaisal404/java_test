/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

/**
 *
 * @author Faisal
 */

import java.sql.*;
public class InsertData {
    
    public static void main(String[] args) {
        Connection conn;
        try {
            String userName="root";
            String password=null;
            String url="jdbc:mysql://localhost/my";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Ok");
            
            Statement stmnt;
            stmnt=conn.createStatement();
            String sql="INSERT INTO `table`(id,name,faki_baj_type)VALUES(null,'faisal','fakibaj')";
            stmnt.executeUpdate(sql);
            System.out.println("Data Inserted Ok");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
