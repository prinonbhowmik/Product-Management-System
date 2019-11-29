
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class database {
    public static Connection ConnectDB(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","123");
    return con;
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    
    
    
    }


}