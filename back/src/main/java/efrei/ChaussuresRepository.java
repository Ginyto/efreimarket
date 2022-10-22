package efrei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChaussuresRepository {
    
    List<Chaussures> chaussures;
    

    public ChaussuresRepository(List<Chaussures> chaussures)
    {chaussures = new ArrayList<>();
        

        Chaussures c1= new Chaussures();
        c1.setNom("converse");
        c1.setId(0);
        c1.setCouleur("blanche");
        c1.setPrix(135);

        Chaussures c2= new Chaussures();
        c2.setNom("yeezy");
        c2.setId(1);
        c2.setCouleur("noir");
        c2.setPrix(200);

        chaussures.add(c1);
        chaussures.add(c2);

    }

    public List<Chaussures> getChaussures(){
        return chaussures;

    }

    public Chaussures getChaussure(int id)
    {
        for(Chaussures c : chaussures){
            if (c.getId()==id) return c;
        }
        return null;
    }

    public Chaussures create() {
        Chaussures c= new Chaussures();
        int nb = chaussures.size()+1;
    
        c.setId(nb);
        try ( Scanner scanner = new Scanner( System.in ) ) {

        String name = scanner.next("Veuillez saisir votre le nom?");
        c.setNom(name);

        String couleur = scanner.next("Veuillez saisir votre couleur?");
        c.setCouleur(couleur);


        System.out.print( "Veuillez saisir votre prix : " );
        int prix = scanner.nextInt();
        c.setPrix(prix);

        return c;
    
        }
    }
    
}
