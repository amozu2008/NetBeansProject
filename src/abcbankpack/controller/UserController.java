package abcbankpack.controller;

import abcbankpack.database.Database;
import abcbankpack.model.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserController {
    
   public static boolean isLoginOk(String newUsername, String newPassword)
   {
        boolean loginOk = false;
        try(
                   Connection con = Database.getMyConnection();
                   Statement stmt = con.createStatement();
                   ResultSet rs = stmt.executeQuery(
                  "select* from AccountUsers where cAu = 001");
            ){
                rs.next();
                
                Users newUser = new Users();
              
                newUser.setUsername(rs.getString("cusername")); 
                newUser.setPassword(rs.getString("cpassword"));
//            
                if(newUsername.equalsIgnoreCase(newUser.getUsername().trim()) && 
                    newPassword.equals(newUser.getPassword().trim()))
               {
                   loginOk = true;
                }
//////           
            }
            catch(SQLException sqle)
           {
//                //throw sqle;
               System.out.println(sqle.getMessage());
           }
        return loginOk;
   }
    
}
