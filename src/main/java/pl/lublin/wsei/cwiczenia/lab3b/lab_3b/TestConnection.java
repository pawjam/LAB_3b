package pl.lublin.wsei.cwiczenia.lab3b.lab_3b;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import java.util.Properties;
import com.mysql.jdbc.Driver;


public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String serverName="localhost";
        String database="mydb";
        Number portNumber=3306;
        Connection conn=null;
        Properties connectionProps= new Properties();
        connectionProps.put("user","root");
        connectionProps.put("password","Tajne123!");
        connectionProps.put("serverTimezone","+02:00");
        conn=DriverManager.getConnection(
                "jdbc:mysql://"+serverName+":"+portNumber+"/"+database,connectionProps
        );
        System.out.println("Connected to database");


    }
}
