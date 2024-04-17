package Dao;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Table {
    public static void main(String[] args) {
        try{
          Connection con=ConnectionProvider.getCon();
          Statement st=con.createStatement();
          //create table
    /*st.executeUpdate("CREATE TABLE Worker("
                    + "name VARCHAR(200), "
                    + "ID VARCHAR(200), "
                    + "dept VARCHAR(50), "
                    + "phn VARCHAR(50), "
                    + "email VARCHAR(50), "
                    + "gen VARCHAR(50)) "

            );*/
    
    /*st.executeUpdate("CREATE TABLE Customer("
      + "Name VARCHAR(100),"
      + "Phone INT(11),"
      + "Email VARCHAR(50),"
      + "Address VARCHAR(200))"
    );*/
    
   /* st.executeUpdate("CREATE TABLE Product("
      + "ID VARCHAR(100),"
      + "Name VARCHAR(50),"
      + "ExpDate VARCHAR(50))"
    );
    */
  
    
    JOptionPane.showMessageDialog(null,"Table creation and data insertion successfull");
        }
        
        catch(Exception e){
            
        JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
}
