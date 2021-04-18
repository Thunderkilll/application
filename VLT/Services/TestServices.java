package Services;

import java.sql.Connection;
import java.sql.SQLException;

import DB.MyConnexion;

public class TestServices {
	private float ts;
    public static void main(String[] args) throws SQLException {
    
    
         Connection db = MyConnexion.Get_Instance().getCon();
    
        // TODO code application logic here
        ServiceAgriculteur AgS = new ServiceAgriculteur();
        ServicesAdmin AdS= new ServicesAdmin();
       // AgS.AjouterOffre();
       // AdS.ajouter(1,c);
      // cs.deleteCommande(sc,26);  
  //   ps.ajouterProdPanier(1,1);
    // Entity.Commandes d = new Entity.Commandes( "hawai2", "lyon", "6", "10021555","nhhh@jjshhs.com", 1, 1, 1);
     //cs.updateCommande(27,d );
   //  ps.calcultotal();
     Entities.produit k=new Entities.Produit();
   // pk.affichepanier();
   //ps.updatefidel(300,1);

 ServicesRecherche s=new ServicesRecherche();
 System.out.println(s.verif("Cake2",1));
  
                       }
}
