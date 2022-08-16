package Adapter.External.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private String url = "jdbc:postgres://postgres@postgres:5432/fiap";

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
