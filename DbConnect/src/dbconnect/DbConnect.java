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
public class DbConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Connection con=null;
        try {
            String userName="root";
            String password=null;
            String url="jdbc:mysql://localhost/my";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection(url,userName,password);
            Statement stmnt;
            ResultSet rset;
            stmnt=con.createStatement();
            rset=stmnt.executeQuery("SELECT * FROM `table`");
            while (rset.next()) {                
                String name=rset.getString("name");
                System.out.println("Name:" + name);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
