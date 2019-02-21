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
public class Deposit {
    
    private int accountNo;
    private double amountDep;
    private String amountInWords;
    
    public Deposit()
    {
        
    }
    
    public boolean isDeposit(int newAccountNo, double newAmountDep,
            String newAmountInWords)
                                
    {
        boolean isDepositOk = false;
        try(
                Connection con = Database.getMyConnection();
                 PreparedStatement prs = con.prepareStatement("insert into deposits"
                    + "(iAcNo, AmtDep, Amtinwords)"
                    + " values (?,?,?)");
           
            )
        {
            
            prs.setInt(1, newAccountNo);
            prs.setDouble(2, newAmountDep);
            prs.setString(3, newAmountInWords);
            
            int rowsAffected = prs.executeUpdate();
            if(rowsAffected > 0)
            {
		isDepositOk = true;	

            }
            
        }
        catch(SQLException sql)
        {
            sql.printStackTrace();
        }
       
        return isDepositOk;
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

    /**
     * @return the amountDep
     */
    public double getAmountDep() {
        return amountDep;
    }

    /**
     * @param amountDep the amountDep to set
     */
    public void setAmountDep(double amountDep) {
        this.amountDep = amountDep;
    }

    /**
     * @return the amountInWords
     */
    public String getAmountInWords() {
        return amountInWords;
    }

    /**
     * @param amountInWords the amountInWords to set
     */
    public void setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
    }
    
}
