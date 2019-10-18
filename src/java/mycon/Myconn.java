
package mycon;
import java.sql.*;
public class Myconn 
{
      static Connection con=null;
      
   public static Connection getConnection()
    {
       try
       {
          Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver load successfully");
       }    
       catch(ClassNotFoundException e)
       {
           System.out.println(e);
       }    
       
       
       try
       {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info","root","root");
            System.out.println("data base connected");
       }    
       catch(SQLException e)
       {
           System.out.println(e);
       }
       
        return con;
    }        
}
