package efrei;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServletContextClass  {

    public Connection getConnection() throws Exception {
        try {
            String connectionURL = "jdbc:mysql://root:port/path";
            Connection connection = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL, "root", "password");
            return connection;
        } catch (SQLException e) {
            throw e;
        }
    }

    


   

}