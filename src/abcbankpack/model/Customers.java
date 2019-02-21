
package abcbankpack.model;

public class Customers {
    
    private int accountNo;
    private String name;
    private String surname;
    private String gender;
    private String homeAddress;
    private String phoneNumber;
    private double balance;
    private String OfficerId;
    
    public Customers(){}
    
//    public boolean isRegister(
//                                String newName, String newSurname, String newGender,
//                                String newHomeAddress, String newPhoneNumber, 
//                                double newBalance, String newOfficerId
//                             )
//    {
//        boolean isRegOk = false;
//        try(
//             Connection con = Database.getMyConnection();
//            PreparedStatement prs = con.prepareStatement("insert into Customersacct"
//                    + "(vcusname,vcussurname,cSex,vAddress,cPhoneNo,mBal,staffid)"
//                    + "values (?,?,?,?,?,?,?)");  
//            )
//        
//        {
//            prs.setString(1, newName);
//            prs.setString(2, newSurname);
//            prs.setString(3, newGender);
//            prs.setString(4, newHomeAddress);
//            prs.setString(5, newPhoneNumber);
//            prs.setDouble(6, newBalance);
//            prs.setString(7, newOfficerId);
//            
//            int rowsAffected = prs.executeUpdate();
//            if(rowsAffected > 0)
//            {
//		isRegOk = true;	
//            }            
//        }
//        catch(SQLException sqle)
//        {
//            System.out.println(sqle.getMessage());
//           // sqle.printStackTrace();
//        }   
//        return isRegOk;
//    }
    
//    public void checkAccountBal(int newAccNo)
//    {
//        try(
//                 Connection con = Database.getMyConnection();
//                 PreparedStatement prs = con.prepareStatement(
//                 "select * from Customersacct where iAcNo = ?");
//            )
//        {     
//            prs.setInt(1, newAccNo);
//            ResultSet rs = prs.executeQuery();
//            rs.next();
//            
//            setAccountNo(rs.getInt("iacno"));
//            setName(rs.getString("vcusname"));
//            setSurname(rs.getString("vcussurname"));
//            setBalance(rs.getDouble("mbal"));
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e.getMessage());
//        }      
//    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param Surname the Surname to set
     */
    public void setSurname(String Surname) {
        this.surname = Surname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the homeAddress
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the OfficerId
     */
    public String getOfficerId() {
        return OfficerId;
    }

    /**
     * @param OfficerId the OfficerId to set
     */
    public void setOfficerId(String OfficerId) {
        this.OfficerId = OfficerId;
    }

    /**
     * @return the accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    
}
