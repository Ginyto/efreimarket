package efrei;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@Path("sneaker")
public class Sneaker {

    Sneakers store = new Sneakers();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return store.getAllSneakers();
    }

    @Path("brand/{brand}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getBrand(@PathParam("brand") String brand) {
        return store.getSneakersByBrand(brand);
    }

    @Path("color/{color}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getColor(@PathParam("color") String color) {
        return store.getSneakersByColor(color);
    }

    @Path("size/{size}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSize(@PathParam("size") String size) {
        return store.getSneakersBySize(size);
    }

    @Path("city/{city}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCity(@PathParam("city") String city) {
        return store.getSneakersByCity(city);
    }

    @Path("price/{price}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPrice(@PathParam("price") String price) {
        return store.getSneakersByPrice(price);
    }

    @Path("userid/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getUserId(@PathParam("id") Integer id) {
        return store.getSneakersByUserId(id);
    }

    @Path("id/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getId(@PathParam("id") Integer id) {
        return store.getSneakerById(id);
    }

    //POST

    @Path("add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String addSneaker(@Valid @NotNull @QueryParam("name") String name, @Valid @NotNull @QueryParam("brand") String brand,
            @Valid @NotNull @QueryParam("color") String color, @Valid @NotNull @QueryParam("size") String size,
            @Valid @NotNull @QueryParam("price") String price, @Valid @NotNull @QueryParam("city") String city,
            @Valid @NotNull @QueryParam("userId") Integer userId) {
        return store.addSneaker(name, brand, color, size, price, city, userId);
    }

    @Path("update")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String updateSneaker(@Valid @NotNull @QueryParam("id") Integer id, @Valid @NotNull @QueryParam("name") String name,
            @Valid @NotNull @QueryParam("brand") String brand, @Valid @NotNull @QueryParam("color") String color,
            @Valid @NotNull @QueryParam("size") String size, @Valid @NotNull @QueryParam("price") String price,
            @Valid @NotNull @QueryParam("city") String city, @Valid @NotNull @QueryParam("userId") Integer userId) {
        return store.updateSneaker(id, name, brand, color, size, price, city, userId);
    }

    @Path("delete")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteSneaker(@Valid @NotNull @QueryParam("id") Integer id, @Valid @NotNull @QueryParam("userId") Integer userId) {
        return store.deleteSneaker(id, userId);
    }

    @Path("borrow")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String borrowSneaker(@Valid @NotNull @QueryParam("id") Integer id,
            @Valid @NotNull @QueryParam("userId") Integer userId) {
        return store.borrowSneaker(id, userId);
    }
    
    @Path("addReview")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String addReview(@Valid @NotNull @QueryParam("id") Integer id,
            @Valid @NotNull @QueryParam("userId") Integer userId, @Valid @NotNull @QueryParam("review") String review, 
            @Valid @NotNull @QueryParam("rate") String rate) {
        return store.review(review, userId, id, rate);
    }



}
