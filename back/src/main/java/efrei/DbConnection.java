package efrei;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



public class DbConnection {
    public Connection getConnection() throws Exception {
        try {
            String connectionURL = "jdbc:mysql://dq8qo54tr7un498t:port/path";
            Connection connection = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL, "dq8qo54tr7un498t", "vvitv6skjmq9jaxq");
            return connection;
        }

        catch (SQLException e) {
            throw e;
            
        }
    }

}
