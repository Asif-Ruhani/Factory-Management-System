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
                    + "salary Varchar(10),"
                    + "Images LONGBLOB,"
                    + "PRIMARY KEY(ID)) "

            );*/
    
    /*st.executeUpdate("CREATE TABLE Customer("
      + "Name VARCHAR(100),"
      + "Phone INT(11),"
      + "Email VARCHAR(50),"
      + "Address VARCHAR(200),"
      + "Images LONGBLOB, "
      + "PRIMARY KEY(Phone))"
    );*/

    
    /*st.executeUpdate("CREATE TABLE Product("
      + "P_ID VARCHAR(100),"
      + "Name VARCHAR(50),"
      + "MfgDate DATE,"
      + "ExpDate DATE,"
      + "Price VARCHAR(10),"
      + "Image LONGBLOB, "
      + "PRIMARY KEY(P_ID))"
    );*/
    
   /* st.executeUpdate("CREATE TABLE Login ("
      + "Serial_No INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"
      + "Username VARCHAR(50),"
      + "Password VARCHAR(50)"
    + ")");*/
    
  
    
    JOptionPane.showMessageDialog(null,"Table creation and data insertion successfull");
        }
        
        catch(Exception e){
            
        JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
}
