
import java.sql.*;

public class demo


{
     public static void main(String[] args) throws SQLException 
    {
        
    Connection myConn=null;
    Statement myStmt=null;
    ResultSet myRs=null;
    
    try
    {
     myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","Sukhram01");

    myStmt=myConn.createStatement();
    
    myRs=myStmt.executeQuery("select * from student");
    while (myRs.next()) 
    {
        System.out.println(myRs.getString("name") + "," +myRs.getString("class"));
    }
   
    }
    catch(Exception exc) 
    {
    exc.printStackTrace();
    
    }
    finally 
    {
        if (myRs !=null) 
    {
        myRs.close();
    }
    if (myStmt !=null) 
    {
        myStmt.close();
    }
    if (myConn !=null) 
    {
        myConn.close();
    }
    }

    }
}
   
    
    
    
