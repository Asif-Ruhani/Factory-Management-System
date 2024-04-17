
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory?useSSL=false","root","");
        return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}