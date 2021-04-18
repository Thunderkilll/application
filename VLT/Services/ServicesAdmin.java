package Services;

import DB.MyConnexion;
import Entities.Offre;
import Entities.Pack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicesAdmin {
	
	Connection db = MyConnexion.Get_Instance().getCon();

	 public void AjouterOffre ( int i  , Offre o) {
	        
		    
	        try {
	            
	                  Statement ste = db.createStatement();
	              String req1 = "INSERT INTO `offre` (`ID_Offre`, `Nom`, `DateDébut`, `DateFin` , `Prix_Offre`,`Produits`,`Qt_Offre`,`Nb_Participants`,`Note`) VALUES ('"+o.getID_Offre()+"','"+o.getNom()+"','"+o.getDateDébut()+"','"+o.getDateFin()+"','"+o.getPrix_Offre()+"','"+o.getProduits()+"','"+o.getQt_Offre()+"','"+o.getNb_Participants()+"','"+o.getNote()+"','"+i+"');";
	                         
	              ste.executeUpdate(req1);
	       
	             System.out.println("AjoutÃ© !!");
	              }
	      catch (SQLException ex) {
	           
	            System.out.println("\n Erreur lors de l'ajout d'un Offre \n"+ex);
	       }
	}



	public void SupprimerOffre( Offre o, int ID_Offre) {
	    
	    try{
	        String sql = "select * from `offre` where id ='"+o.getID_Offre()+"'";
	        ResultSet result ;
	         Statement ste = db.createStatement();
	     result = ste.executeQuery(sql);
	while(result.next()){
	       
	        
	        System.out.println("id = "+o.getID_Offre());//retourne l'id user qui est auto incrÃ©mentÃ© dans la base 
	        PreparedStatement prep = db.prepareStatement("delete  from `offre` where id='"+ID_Offre+"'");
	    
	        prep.executeUpdate();
	       System.out.println("SupprimerOffre done 2 \n");
	       
	    }
	       
	} catch (SQLException ex) {
	      System.out.println("SupprimerOffre failed \n"+ex);
	}


	}

	public void ModifierOffre(int t , Offre f) {
	    try {   
	       
	  String sql1 = "UPDATE `offre`  SET `Nom`='" + f.getNom() + "',`DateDébut`='" + f.getDateDébut() +"',`DateFin`='"+f.getDateFin()+"',`Prix_Offre`= '"+f.getPrix_Offre()+"' ,`Produits` ='"+f.getProduits()+"',`Qt_Offre` ='"+f.getQt_Offre()+"',`Nb_Participants` ='"+f.getNb_Participants()+"',`Note` ='"+f.getNote()+"' WHERE id ='" +t+ "';";

	   PreparedStatement ste1 = db.prepareStatement(sql1);
	   ste1.executeUpdate();
	   System.out.println("L'offre : "+f.getID_Offre()+" is updated");
	  }
	  catch(SQLException ex){
	      
	      System.out.println("Update failed "+ex);
	      System.out.println("\n or ID doesn't exist ");
	  }
	}
	    
	    
	   public void AjouterPack (int i , Pack p ) {     
		    
	        try {
	            
	                  Statement ste = db.createStatement();
	                  
	              String req1 = "INSERT INTO `pack` (`ID_pack`, `Nom`, `Prix_Pack`, `Produits` , `Qt_Pack`, `Nb_Participants` , `Note`,`Type`) VALUES ('"+p.getID_Pack()+"','"+p.getNom()+"','"+p.getPrix_Pack()+"','"+p.getNb_Participants()+"','"+p.getQt_Pack()+"','"+p.getNote()+"','"+p.getType()+"','"+i+"','"+0+"');";
	                         
	              ste.executeUpdate(req1);
	       
	             System.out.println("AjoutÃ© !!");
	              }
	      catch (SQLException ex) {
	           
	            System.out.println("\n Erreur lors de l'ajout d'un pack  \n"+ex);
	       }
	   }
	   
	        public void SupprimerPack( Pack p , int ID_Pack) {
	            
	            try{
	                String sql = "select * from `pack` where id ='"+p.getID_Pack()+"'";
	                ResultSet result ;
	                 Statement ste = db.createStatement();
	             result = ste.executeQuery(sql);
	        while(result.next()){
	               
	               
	                System.out.println("id = "+p.getID_Pack());//retourne l'id user qui est auto incrÃ©mentÃ© dans la base 
	                PreparedStatement prep = db.prepareStatement("delete  from `offre` where id='"+ID_Pack+"'");
	            
	                prep.executeUpdate();
	               System.out.println("SupprimerPack done 2 \n");
	               
	            }
	               
	        } catch (SQLException ex) {
	              System.out.println("SupprimerPack failed \n"+ex);
	        }


	        }
	        
	 
	public void ModifierPack (int t , Pack a) {
	    try {   
	       
	  String sql1 = "UPDATE `pack`  SET `Nom`='" + a.getNom() + "',`Prix_Pack`='" + a.getPrix_Pack() +"',`Produits`='"+a.getProduits()+"',`Qt_Pack`= '"+a.getQt_Pack()+"' ,`Nb_Participants`='"+a.getNb_Participants()+"' ,`Note` ='"+a.getNote()+"',`Type` ='"+a.getType()+"' WHERE id ='" +t+ "';";

	   PreparedStatement ste1 = db.prepareStatement(sql1);
	   ste1.executeUpdate();
	   System.out.println("Le Pack : "+a.getID_Pack()+" is updated");
	  }
	  catch(SQLException ex){
	      
	      System.out.println("Update failed "+ex);
	      System.out.println("\n or ID doesn't exist ");
	  }
	}
	public ArrayList<Offre> AfficherOffre() {
	    ArrayList<Offre> offre = new ArrayList<>();

	  try {
	         String sql = " SELECT * from offre where 1;";
	   ResultSet result ;
	          Statement ste = db.createStatement();
	           result = ste.executeQuery(sql);
	         while(result.next()){

	    Offre o2 = new Offre();
	       
	       o2.setNom(result.getString("nom"));
	       o2.setDateDébut(result.getDate("datedébut"));
	       o2.setDateFin(result.getDate("datefin"));
	       o2.setPrix_Offre(result.getFloat("prix_Offre"));
	       o2.setNb_Participants(result.getInt("nb_Participants"));
	       o2.setQt_Offre(result.getInt("qt_Offre"));
	       o2.setNote(result.getInt("note"));



	Offre.add(o2);
	System.out.println("liste remplit ");
	}
	} catch (SQLException e) {
	   System.out.println("error is \n"+e);
	}

	return offre ;
	}
	    

	public ArrayList<Pack> AfficherPack() {
	    ArrayList<Pack> pack = new ArrayList<>();

	  try {
	         String sql = " SELECT * from pack where 1;";
	   ResultSet result ;
	          Statement ste = db.createStatement();
	           result = ste.executeQuery(sql);
	         while(result.next()){

	        	 Pack p2 = new Pack();
	       p2.setNom(result.getString("nom"));
	       p2.setPrix_Pack(result.getFloat("prix_Pack"));
	       p2.setNb_Participants(result.getInt("nb_Participants"));
	       p2.setQt_Pack(result.getInt("qt_Pack"));
	       p2.setNote(result.getInt("note"));
	       p2.setType(result.getString("type"));



	Pack.add(p2);
	System.out.println("liste remplit ");
	}
	} catch (SQLException e) {
	   System.out.println("error is \n"+e);
	}

	return pack ;
	}





}
