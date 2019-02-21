
package abcbankpack.controller;

import abcbankpack.database.Database;
import abcbankpack.entity.CustomersAcct;
import abcbankpack.entity.StaffDetails;
import abcbankpack.model.Customers;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.persistence.EntityManager;

public class CustomersController {
    
    public static boolean isRegister(String newFirstname, String newLastname, String newGender, String newAddress, String newPhoneNo, BigDecimal newBalance, StaffDetails newStaffid)
    {
        boolean isRegOk = false;
        
        CustomersAcct customer = new CustomersAcct();
        customer.setVCusName(newFirstname);
        customer.setVCusSurname(newLastname);
        customer.setCSex(newGender);
        customer.setVAddress(newAddress);
        customer.setCPhoneNo(newPhoneNo);
        customer.setMBal(newBalance);
        customer.setStaffid(newStaffid);
        
        try{
            EntityManager em = Database.getJPAConnection();
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            em.close();
            
            isRegOk = true;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return isRegOk;
    }
    
    public static boolean isRegister(Customers newCustomer)
    {
        boolean isRegOk = false;
        try(
             Connection con = Database.getMyConnection();  
                PreparedStatement prs = con.prepareStatement("insert into Customersacct"
                    + "(vcusname,vcussurname,cSex,vAddress,cPhoneNo,mBal,staffid)"
                    + "values (?,?,?,?,?,?,?)");             
            )   
        {
           
             prs.setString(1, newCustomer.getName());
             prs.setString(2, newCustomer.getSurname());
             prs.setString(3, newCustomer.getGender());
             prs.setString(4, newCustomer.getHomeAddress());
             prs.setString(5, newCustomer.getPhoneNumber());
             prs.setDouble(6, newCustomer.getBalance());
             prs.setString(7, newCustomer.getOfficerId());
//             
             int rowsAffected = prs.executeUpdate();
            if(rowsAffected > 0)
            {
		isRegOk = true;	
            }      
        }
        catch(Exception ex)
        {
           System.out.println(ex.getMessage());
        }
        return isRegOk;  
    } 
    
   
    
    public static Customers checkAccountBal(int newAccountNo)
    {
        Customers cust = null;
        try(
                Connection con = Database.getMyConnection();
                 PreparedStatement prs = con.prepareStatement(
                 "select * from Customersacct where iAcNo = ?");
            )
       {
            prs.setInt(1, newAccountNo);
            ResultSet rs = prs.executeQuery();
            
            rs.next();
            
            cust = new Customers();
            cust.setAccountNo(rs.getInt("iacno"));
            cust.setName(rs.getString("vcusname"));
            cust.setSurname(rs.getString("vcussurname"));
            cust.setBalance(rs.getDouble("mbal"));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }        
        return cust;
    }
}
