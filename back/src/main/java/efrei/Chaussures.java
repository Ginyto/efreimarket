package efrei;



public class Chaussures {

    int id;
    String nom;
    String couleur;
    int prix;

    public Chaussures(int id, String nom, String couleur, int prix){
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
        this.prix= prix;
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


    public void CreateCommande(){

    }

}



    
  