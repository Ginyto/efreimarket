package efrei;
import java.util.Scanner; 


public class Chaussures {

    private int id;
    private String nom;
    private String couleur;
    private int prix;
    Scanner scan = new Scanner(System.in);
    

    public Chaussures(int id, String nom, String couleur, int prix){
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
        this.prix= prix;
    }
    public Chaussures(){
        
    }

    public Chaussures(int id){
        this.id= id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


   
	

}



    
  