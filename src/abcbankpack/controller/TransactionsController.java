
package abcbankpack.controller;

import abcbankpack.database.Database;
import abcbankpack.model.Transactions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionsController 
{    
    public static boolean doTransaction(Transactions newTransation)
    {
        boolean isDoTrans = false;
        try
            (
            
            Connection con = Database.getMyConnection();
            PreparedStatement prs = con.prepareStatement("insert into Transactions"
                    + "(iacno,amount,AmtInWords,TransType)"
                    + "values (?,?,?,?)");  
            )
        {
            prs.setInt(1, newTransation.getAccountNo());
            prs.setDouble(2, newTransation.getAmount());
            prs.setString(3, newTransation.getAmtInWords());
            prs.setString(4, newTransation.getTransType());
            
            int rowsAffected = prs.executeUpdate();
            
            if(rowsAffected > 0)
            {
		isDoTrans = true;	
            }            
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }
        return isDoTrans;
    }
    
}
