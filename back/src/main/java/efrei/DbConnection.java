package efrei;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://@ltnya0pnki2ck9w8.chr7pe7iynqr.eu-west-1.rds.amazonaws.com.database.windows.net:1433;"
                        + "database=AdventureWorks;"
                        + "user=dq8qo54tr7un498t@ltnya0pnki2ck9w8.chr7pe7iynqr.eu-west-1.rds.amazonaws.com;"
                        + "password=vvitv6skjmq9jaxq;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}