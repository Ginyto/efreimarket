package efrei;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/chaussures")
public class ChaussuresRessource {

    ChaussuresRepository repo= new ChaussuresRepository(null);

    @GET
    @Produces(MediaType.APPLICATION_XML)

    public List<Chaussures> getChaussures()
    {
        return repo.getChaussures();
    }

    @POST
@Path("/Chaussure")
    
    public Chaussures createChaussures(){

        return repo.create();

    }
   
}