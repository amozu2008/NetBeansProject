package abcbankpack.database;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Database 
{
    private static Connection con;
    
    public static EntityManager getJPAConnection()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ABCBankPU");
        EntityManager em = emf.createEntityManager();  

        return em;
    }
    public static Connection getMyConnection()
    {
        try
        {
////           File file = new File("ConnectionString.properties");
////           String pathFile = file.getPath();
////           Properties fileName = new Properties();
////           fileName.load(new FileInputStream(pathFile));
       
         
       con = DriverManager.getConnection
                                         (                                                
////                                      fileName.getProperty("conString"),
////                                      fileName.getProperty("username"),
////                                      fileName.getProperty("password")
        "jdbc:sqlserver://localhost:1433;DatabaseName=ABC","sa", "computer"
                                         );
       }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    return con;                               
    }    
}

//            //File file = new File("ConnectionFile.properties");
//           // String pathFile = file.getPath();
//           // Properties fileName = new Properties();
//            //fileName.load(new FileInputStream(pathFile));
//            // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//         //con = DriverManager.getConnection(
//             //  fileName.getProperty("conString"),fileName.getProperty("userNameDb"),
//            //     fileName.getProperty("passwordDb")
//          //  );