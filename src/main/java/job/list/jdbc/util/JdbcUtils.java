package job.list.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    public static Connection getConnection() throws SQLException {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/test",
                "root",
                "root")) {
            return connection;
        }
    }
}
