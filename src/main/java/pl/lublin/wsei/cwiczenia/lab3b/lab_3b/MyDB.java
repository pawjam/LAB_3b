package pl.lublin.wsei.cwiczenia.lab3b.lab_3b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {
    private String user;
    private String password;
    private String host;
    private Integer port;
    private String db;
    public MyDB(String host, Integer port, String db){
        this.host=host;
        this.port=port;
        this.db=db;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Connection conn=null;
    private void connect(){
        Properties connectionProps= new Properties();
        connectionProps.put("user","root");
        connectionProps.put("password","Tajne123!");
        connectionProps.put("serverTimezone","+02:00");
        String jdbcString="jdbc:mysql://"+host+":"+port+"/"+db;
        try{
            conn= DriverManager.getConnection(
                    jdbcString,connectionProps
            );
        }
        catch (SQLException e){
            System.out.println("Błąd połączenia do bazy: "+jdbcString);
            System.out.println("Komunikat błędu: "+e.getMessage());
        }
        System.out.println("Connected to the databas: "+db);
    }
    public Connection getConnection(){
        if (conn==null)
            connect();
        return conn;
    }



}
