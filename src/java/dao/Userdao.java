
package dao;
import java.sql.*;
import mycon.Myconn;
import java.util.*;
public class Userdao 
{
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     String sql;
   public boolean insertUser(User u) throws Exception
   {
      sql="insert into user values(?,?)";
      con=Myconn.getConnection();
      ps=con.prepareStatement(sql);
      ps.setString(1, u.getName());
      ps.setString(2, u.getPass());
      if(ps.executeUpdate()>0)
          return true;
      
      return false;
   }     
}