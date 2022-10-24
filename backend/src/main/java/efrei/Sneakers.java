package efrei;

public class Sneakers {

    public Integer id;

    public String name;

    public String brand;

    public String color;

    public String size;

    public String price;

    public DB db = new DB();


    public Sneakers(Integer id) {

        this.id = id;

        this.name = db.getName(id);

        this.brand = db.getBrand(id);

        this.color = db.getColor(id);

        this.size = db.getSize(id);

        this.price = db.getPrice(id);


    }
    

}