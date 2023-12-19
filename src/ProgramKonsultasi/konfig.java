package ProgramKonsultasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class konfig {
    
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/konsultasi";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = (Connection)DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException e){
            System.out.println("Koneksi Ke Database Gagal "+e.getMessage());
            
        }
        return MySQLConfig;
        
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
