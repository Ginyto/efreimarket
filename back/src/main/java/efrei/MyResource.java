package efrei;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// import java.sql.Connection;
// import java.util.ArrayList;
// import java.util.List;

// import javax.script.ScriptContext;

// import jakarta.ws.rs.Consumes;
// import jakarta.ws.rs.GET;
// import jakarta.ws.rs.Path;
// import jakarta.ws.rs.PathParam;
// import jakarta.ws.rs.Produces;
// import jakarta.ws.rs.core.Context;
// import jakarta.ws.rs.core.MediaType;
// import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */

public class MyResource {
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