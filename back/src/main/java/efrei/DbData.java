package efrei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DbData {
    
    public List<Chaussures> getAllChaussures(Connection connection) throws Exception {
        List<Chaussures> chaussuresList = new ArrayList<Chaussures>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT id, name FROM Chaussures");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Chaussures chaussures = new Chaussures();
                chaussures.setId(rs.getInt("id"));
                chaussures.setNom(rs.getString("name"));
                chaussuresList.add(chaussures);
            }
            return chaussuresList;
        } catch (Exception e) {
                throw e;
        }
    }
}
