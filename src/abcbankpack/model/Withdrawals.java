/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abcbankpack.model;

import abcbankpack.database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author NEWHORIZONS
 */
public class Withdrawals {
    
    private int accountNo;
    private double amountWit;
    private String amountInWords;
    
    public Withdrawals()
    {
        
    }
    
    public boolean isWithdraw(int newAccountNo, double newAmountWit,
            String newAmountInWords)
                                
    {
        boolean isWithdrawOk = false;
        try(
                Connection con = Database.getMyConnection();
                 PreparedStatement prs = con.prepareStatement("insert into withdrawls"
                    + "(iAcNo, Amtwithdrawn, Amtinwords)"
                    + " values (?,?,?)");
           
            )
        {
            
            prs.setInt(1, newAccountNo);
            prs.setDouble(2, newAmountWit);
            prs.setString(3, newAmountInWords);
            
            int rowsAffected = prs.executeUpdate();
            if(rowsAffected > 0)
            {
		isWithdrawOk = true;	

            }
            
        }
        catch(SQLException sql)
        {
            sql.printStackTrace();
        }
       
        return isWithdrawOk;
    }
    
}
