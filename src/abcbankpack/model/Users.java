
package abcbankpack.model;

public class Users {
    
    private String userId;
    private String username;
    private String password;
 
    public Users(){}
    
        public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    //    public boolean isLoginOk(String newUsername, String newPassword)
//   {
//        boolean loginOk = false;
//        try(
//                   Connection con = Database.getMyConnection();
//                   Statement stmt = con.createStatement();
//                   ResultSet rs = stmt.executeQuery(
//                    "select* from AccountUsers where cAu = 001");
//            ){
//                rs.next();
//                
//                setUsername(rs.getString("cusername")); 
//                setPassword(rs.getString("cpassword"));
//            
//                if(newUsername.equalsIgnoreCase(getUsername().trim()) && 
//                    newPassword.equals(getPassword().trim()))
//                {
//                    loginOk = true;
//                }
////           
//            }
//            catch(SQLException sqle)
//            {
//                //throw sqle;
//                System.out.println(sqle.getMessage());
//            }
//        return loginOk;
//   }
    
}
