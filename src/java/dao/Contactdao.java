
package dao;
import java.sql.*;
import mycon.Myconn;
import java.util.*;
public class Contactdao 
{
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     String sql;
   public boolean insertContact(Contact c) throws Exception
   {
      sql="insert into feedback values(?,?,?,?)";
      con=Myconn.getConnection();
      ps=con.prepareStatement(sql);
      ps.setString(1, c.getName());
      ps.setString(2, c.getEmail());
      ps.setString(3, c.getWebsite());
      ps.setString(4, c.getMessage());
      if(ps.executeUpdate()>0)
          return true;
      
      return false;
   }     
}