package efrei;
import java.util.Scanner; 

public class Customers{
    public int id;
    public String nom;
    public String prenom;

    Scanner scan = new Scanner(System.in);
    public Customers(int id) {
        this.id = id;
    }

    
    public Customers(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    

    public void CreateUser(){
        

    String name = scan.next("le nom?");
    nom = name;

    String firstname = scan.next("Le prenom?");
    prenom = firstname;


    }

    
}