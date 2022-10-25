package efrei;

import java.sql.*;

public class DB {

    String url = "jdbc:mysql://ltnya0pnki2ck9w8.chr7pe7iynqr.eu-west-1.rds.amazonaws.com/f10asnaepr3n29ua";

    String username = "dq8qo54tr7un498t";

    String password = "vvitv6skjmq9jaxq";

    Connection con = null;

    Statement state = null;

    ResultSet result = null;

    public DB() {

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

    public String getName(Integer id) {
            
            String name = "";
    
            try {
                ResultSet result = state.executeQuery("SELECT name FROM sneakers WHERE id = " + id);
    
                while (result.next()) {
                    name = result.getString("name");
                }
    
            } catch (Exception e) {
                System.out.println(e);
            }
    
            return name;
    
    }

    public String getBrand(Integer id) {
                
                String brand = "";
        
                try {
                    ResultSet result = state.executeQuery("SELECT brand FROM sneakers WHERE id = " + id);
        
                    while (result.next()) {
                        brand = result.getString("brand");
                    }
        
                } catch (Exception e) {
                    System.out.println(e);
                }
        
                return brand;
        
    }

    public String getColor(Integer id) {
                    
                    String color = "";
            
                    try {
                        ResultSet result = state.executeQuery("SELECT color FROM sneakers WHERE id = " + id);
            
                        while (result.next()) {
                            color = result.getString("color");
                        }
            
                    } catch (Exception e) {
                        System.out.println(e);
                    }
            
                    return color;
            
    }

    public String getSize(Integer id) {
                            
                            String size = "";
                    
                            try {
                                ResultSet result = state.executeQuery("SELECT size FROM sneakers WHERE id = " + id);
                    
                                while (result.next()) {
                                    size = result.getString("size");
                                }
                    
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                    
                            return size;
                    
    }

    public String getPrice(Integer id) {
                                    String price = "";
                            
                                    try {
                                        ResultSet result = state.executeQuery("SELECT price FROM sneakers WHERE id = " + id);
                            
                                        while (result.next()) {
                                            price = result.getString("price");
                                        }
                            
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                            
                                    return price;
                            
    }

    public String getCity(Integer id) {
                                            
                                            String city = "";
                                    
                                            try {
                                                ResultSet result = state.executeQuery("SELECT city FROM sneakers WHERE id = " + id);
                                    
                                                while (result.next()) {
                                                    city = result.getString("city");
                                                }
                                    
                                            } catch (Exception e) {
                                                System.out.println(e);
                                            }
                                    
                                            return city;
                                    
    }

    public Integer getUserId(Integer id) {
                                                    
                                                    Integer userId = 0;
                                            
                                                    try {
                                                        ResultSet result = state.executeQuery("SELECT owner FROM sneakers WHERE id = " + id);
                                            
                                                        while (result.next()) {
                                                            userId = result.getInt("owner");
                                                        }
                                            
                                                    } catch (Exception e) {
                                                        System.out.println(e);
                                                    }
                                            
                                                    return userId;
                                            
    }

    public Integer getBorrowId(Integer id) {
                                                            
                                                            Integer borrowId = 0;
                                                    
                                                            try {
                                                                ResultSet result = state.executeQuery("SELECT borrower FROM sneakers WHERE id = " + id);
                                                    
                                                                while (result.next()) {
                                                                    borrowId = result.getInt("borrower");
                                                                }
                                                    
                                                            } catch (Exception e) {
                                                                System.out.println(e);
                                                            }
                                                    
                                                            return borrowId;
                                                    
    }
}
