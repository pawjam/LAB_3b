package pl.lublin.wsei.cwiczenia.lab3b.lab_3b;


import java.sql.Connection;

public class TestMyDB {
    public static void main(String[] args) {
        MyDB db=new MyDB("localhost",3306,"MyDB");
        db.setUser("root");
        db.setPassword("Tajne123!");
        Connection conn=db.getConnection();
        if (conn != null)
            System.out.println("Połaczenie z bazą danych nawiazane");
        db.closeConnection();
        System.out.println("Połączenie z bazą zakonczone");
    }


}
