
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycon.Myconn;


public class Login 
{
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     String sql;
   
  public boolean checkLogin(String uname,String upass) throws Exception    
  {
      sql="select * from user where name=? and password=?";
      con=Myconn.getConnection();
      ps=con.prepareStatement(sql);
      ps.setString(1, uname);
      ps.setString(2, upass);
      rs=ps.executeQuery();
      if(rs.next())
       return true;
      
      
      return false;
      
  }        
}
