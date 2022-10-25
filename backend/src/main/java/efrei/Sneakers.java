package efrei;

public class Sneakers {

    public Integer id;

    public String name;

    public String brand;

    public String color;

    public String size;

    public String price;

    public String city;

    public Integer userId;

    public Integer borrowId;

    public DB db = new DB();

    public Sneakers() {

    }

    public Sneakers(Integer id) {

        this.id = id;

        this.name = db.getName(id);

        this.brand = db.getBrand(id);

        this.color = db.getColor(id);

        this.size = db.getSize(id);

        this.price = db.getPrice(id);

        this.city = db.getCity(id);

        this.userId = db.getUserId(id);

        this.borrowId = db.getBorrowId(id);

    }

    public String getName(Integer id) {

        return db.getName(id);

    }

    public String getBrand(Integer id) {

        return db.getBrand(id);

    }

    public String getColor(Integer id) {

        return db.getColor(id);

    }

    public String getSize(Integer id) {

        return db.getSize(id);

    }

    public String getPrice(Integer id) {

        return db.getPrice(id);

    }

    public String getCity(Integer id) {

        return db.getCity(id);

    }

    public Integer getUserId(Integer id) {

        return db.getUserId(id);

    }

    public Integer getBorrowId(Integer id) {

        return db.getBorrowId(id);

    }

    public String toString() {

        try {

            return "{" + "\n id:" + id + ",\n name:" + name + ",\n brand:" + brand + ",\n color:" + color + ",\n size:" + size + ",\n price:" + price + ",\n city:" + city + ",\n userId:" + userId + ",\n borrowId:" + borrowId +"\n}";

        } catch (Exception e) {

            return "Error not found" + e;
        }

    }
    
    public String getSneakerById(int id) {

        return new Sneakers(id).toString();

    }

    public String getAllSneakers() {

        String allSneakers = "";

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers");

            while (db.result.next()) {

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n city : " + db.result
                                .getString("city") + "\n userid : " + db.result.getString("owner") +"\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        return allSneakers;

    }
    
    public String getSneakersByBrand(String brand) {

        String allSneakers = "";

        System.out.println("recherche des sneakers de la marque " + brand);

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers WHERE brand = '" + brand + "'");

            while (db.result.next()) {

                System.out.println(db.result.getString("brand"));

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        if (allSneakers == "") {

            allSneakers = "Aucune paire de sneakers trouvée pour la marque " + brand;

        }

        return allSneakers;

    }

    public String getSneakersByColor(String color) {

        String allSneakers = "";

        System.out.println("recherche des sneakers de la couleur " + color);

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers WHERE color = '" + color + "'");

            while (db.result.next()) {

                System.out.println(db.result.getString("color"));

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        if (allSneakers == "") {

            allSneakers = "Aucune paire de sneakers trouvée pour la couleur " + color;

        }

        return allSneakers;

    }


    public String getSneakersBySize(String size) {

        String allSneakers = "";

        System.out.println("recherche des sneakers de la taille " + size);

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers WHERE size = '" + size + "'");

            while (db.result.next()) {

                System.out.println(db.result.getString("size"));

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        if (allSneakers == "") {

            allSneakers = "Aucune paire de sneakers trouvée pour la taille " + size;

        }

        return allSneakers;

    }


    public String getSneakersByPrice(String price) {

        String allSneakers = "";

        System.out.println("recherche des sneakers de la taille " + price);

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers WHERE price = '" + price + "'");

            while (db.result.next()) {

                System.out.println(db.result.getString("price"));

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        if (allSneakers == "") {

            allSneakers = "Aucune paire de sneakers trouvée pour le prix " + price;

        }

        return allSneakers;

    }


    public String getSneakersByCity(String city) {

        String allSneakers = "";

        System.out.println("recherche des sneakers de la ville " + city);

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers WHERE city = '" + city + "'");

            while (db.result.next()) {

                System.out.println(db.result.getString("city"));

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        if (allSneakers == "") {

            allSneakers = "Aucune paire de sneakers trouvée pour la ville " + city;

        }

        return allSneakers;

    }

    public String getSneakersByUserId(Integer id) {

        String allSneakers = "";

        System.out.println("recherche des sneakers de l'utilisateur " + id);

        try {

            db.result = db.state.executeQuery("SELECT * FROM sneakers WHERE owner = '" + id + "'");

            while (db.result.next()) {

                System.out.println(db.result.getString("owner"));

                allSneakers += "{\n id : " + db.result.getInt("id") + "\n name : " + db.result.getString("name")
                        + "\n brand : "
                        + db.result.getString("brand") + "\n color : " + db.result.getString("color") + "\n size : "
                        + db.result.getString("size")
                        + "\n price : " + db.result.getString("price") + "€" + "\n},\n";

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        if (allSneakers == "") {

            allSneakers = "Aucune paire de sneakers trouvée pour l'utilisateur " + id;

        }

        return allSneakers;

    }
        
    public String addSneaker(String name, String brand, String color, String size, String price, String city, Integer owner) {
            
            String allSneakers = "";
    
            System.out.println("ajout d'une paire de sneakers");
    
            try {
    
                db.state.executeUpdate("INSERT INTO sneakers (name, brand, color, size, price, city, owner) VALUES ('"
                        + name + "', '" + brand + "', '" + color + "', '" + size + "', '" + price + "', '" + city + "', '"
                        + owner + "')");
    
                allSneakers = "Paire de sneakers ajoutée";
    
            } catch (Exception e) {
    
                System.out.println(e);
    
            }
    
            return allSneakers;
    
        };
    
    
        public String deleteSneaker(Integer id, Integer owner) {
        
                String allSneakers = "";
        
                System.out.println("suppression d'une paire de sneakers");
        
                try {
        
                    db.state.executeUpdate("DELETE FROM sneakers WHERE id = '" + id + "' AND owner = '" + owner + "'");
        
                    allSneakers = "Tentative de suppression";
        
                } catch (Exception e) {

                    System.out.println(e);

                }
                
                if (allSneakers == "") {

                    allSneakers = "Aucune paire de sneakers trouvée pour l'utilisateur " + owner + " et l'id " + id;

                }
        
                return allSneakers;
    
    };

    public String updateSneaker(Integer id, String name, String brand, String color, String size, String price, String city, Integer owner) {
    
        String allSneakers = "";
    
        System.out.println("modification d'une paire de sneakers");
    
        try {
    
            db.state.executeUpdate("UPDATE sneakers SET name = '" + name + "', brand = '" + brand + "', color = '" + color + "', size = '" + size + "', price = '" + price + "', city = '" + city + "', owner = '" + owner + "' WHERE id = '" + id + "'");
    
            allSneakers = "Paire de sneakers modifiée";
    
        } catch (Exception e) {
    
            System.out.println(e);
    
        }
    
        return allSneakers;
    
    };

    public String borrowSneaker(Integer id, Integer userId) {
    
        String allSneakers = "";
    
        System.out.println("emprunt d'une paire de sneakers");
    
        try {
    
            db.state.executeUpdate("UPDATE sneakers SET borrowId = '" + userId + "' WHERE id = '" + id + "'");
    
            allSneakers = "Paire de sneakers empruntée";
    
        } catch (Exception e) {
    
            System.out.println(e);
    
        }
    
        return allSneakers;
    
    };

    public String review(String review, Integer userId, Integer id, String rate) {
    
        String allSneakers = "";
    
        System.out.println("ajout d'un avis");
    
        try {
    
            db.state.executeUpdate("INSERT INTO reviews (review, userId, sneakId, rate) VALUES ('" + review + "', '" + userId + "', '" + id + "', '" + rate + "')");
    
            allSneakers = "Avis ajouté";
    
        } catch (Exception e) {
    
            System.out.println(e);
    
        }
    
        return allSneakers;
    
    };

}