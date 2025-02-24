package designPatternSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDatenbankverbindung {

    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/yourdatabase";
    private String username = "yourusername";
    private String password = "yourpassword";

    private MysqlDatenbankverbindung() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex);
        }
    }

    private static class SingletonHelper {
        private static final MysqlDatenbankverbindung INSTANCE;

        static {
            try {
                INSTANCE = new MysqlDatenbankverbindung();
            } catch (SQLException e) {
                throw new ExceptionInInitializerError(e);
            }
        }
    }

    public static MysqlDatenbankverbindung getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public Connection getConnection() {
        return connection;
}
}