package efrei;

import java.sql.*;

public final class App {

    public static void main(String[] args) {

        String url = "jdbc:mysql://ltnya0pnki2ck9w8.chr7pe7iynqr.eu-west-1.rds.amazonaws.com/f10asnaepr3n29ua";

        String username = "dq8qo54tr7un498t";

        String password = "vvitv6skjmq9jaxq";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

    }
}
