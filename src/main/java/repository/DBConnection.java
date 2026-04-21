package repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        String url = "jdbc:sqlserver://localhost:1433;"
                   + "databaseName=StoreDB;"
                   + "encrypt=false;trustServerCertificate=true";

        String user = "sa";        // hoặc user bạn tạo
        String password = "123"; // sửa lại theo máy bạn

        return DriverManager.getConnection(url, user, password);
    }
}