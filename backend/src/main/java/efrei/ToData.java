package efrei;

import java.sql.*;


public class ToData {

    String url = "jdbc:mysql://ltnya0pnki2ck9w8.chr7pe7iynqr.eu-west-1.rds.amazonaws.com/f10asnaepr3n29ua";

    String username = "dq8qo54tr7un498t";

    String password = "vvitv6skjmq9jaxq";

    Connection con = null;

    Statement state = null;

    public ToData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            this.con = connection;
            this.state = statement;

            System.out.println("Database connected!");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Database not connected!");
        }

    }
    
    public String getSneakers() {

        String res = "";

        try{
            ResultSet rs = state.executeQuery("SELECT * FROM chaussures");

            while (rs.next()) {
                res += rs.getString("id") + " " + rs.getString("name");
            }


        }
        catch (Exception e) {
            System.out.println(e);
        }


        return res;
    }
}
