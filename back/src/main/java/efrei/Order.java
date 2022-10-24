package efrei;

import java.util.ArrayList;
import java.util.List;

public class Order {

    


    private int State;
    
    public List<Customers> Clients = new ArrayList<>();


    public List<Chaussures> Commandes = new ArrayList<>();

    
  

    public void getOrders(){
        System.out.println("commandes: " + Commandes); 

    }

    public void submitOrder(){
        if (State==0){System.out.println("Commande confirmé");}
    }

    public void getOrdersDetails(){
      
        Commandes.forEach(commande-> System.out.println( commande));

        }
  

    public void getOrdersForCustomer(ArrayList Clients, int id){

    }

    public void updateOrder(){

    }

    public void addOrderItem(){
        Chaussures commande = new Chaussures(Commandes.size() + 1);
        
        Commandes.add(commande);

    }

    public void cancelOrder(){
        Commandes.clear();

    }

    public void deleteChaussure(int id){
        Commandes.remove(id);


    }


    public void getCustomers(){
        

    }
/* 
    public void addCustomers(){
        Customers client = new Customers(Clients.size() + 1);
            client.CreateUser();
            Clients.add(client);

<<<<<<< HEAD
    }*/

=======
    }
*/
>>>>>>> 880a110135a26865cc59b1e7c5096d2f7a40acd6
    public void getCustomersDetails(){

        Clients.forEach(client-> System.out.println( client));


    }

    public void updateCustomer(){
        
    }

    public void deleteCustomer(int id)
    {
        Clients.remove(id);

    }



}