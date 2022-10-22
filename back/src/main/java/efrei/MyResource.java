package efrei;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptContext;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
<<<<<<< HEAD
@Path("/myresource")
=======
@Path("myresource")


>>>>>>> 90315039a7931e3941f96a1a9e055334256529fd
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello there";
    }
    @GET
    @Path("Chaussures/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getInfos(@PathParam("ChaussuresId") int taskId, @Context ScriptContext context) throws Exception {
    try {
        DbConnection database= new DbConnection();
        Connection connection = database.getConnection();
        List<Chaussures> chaussures = new ArrayList<>();
        DbData dbData = new DbData();
        chaussures = dbData.getAllChaussures(connection);

        return Response.status(200).entity(chaussures).build();
    } catch (Exception e) {
        throw e;
    }
}
}
