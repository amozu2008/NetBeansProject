/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcbankpack.controller;

import abcbankpack.database.Database;
import abcbankpack.entity.StaffDetails;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author JUDE
 */
public class StaffController {
    
    public static List<StaffDetails> getAllStaffId()
    {
        List<StaffDetails> staffIDList = null;
        
        EntityManager em = Database.getJPAConnection();
        try
        {
            Query query = em.createQuery("select staffid from StaffDetails staffid", StaffDetails.class);
       
            staffIDList = query.getResultList();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
       return staffIDList;
    }
    
    public static StaffDetails findStaff(String newStaffId)
    {
        StaffDetails staff = null;
         EntityManager em = Database.getJPAConnection();
         try
         {
            staff = em.find(StaffDetails.class, newStaffId);
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
         return staff;
    }
    
}
