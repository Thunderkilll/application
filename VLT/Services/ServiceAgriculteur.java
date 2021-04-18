package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DB.MyConnexion;
import Entities.Vache;

public class ServiceAgriculteur {

      Connection db = MyConnexion.Get_Instance().getCon();
	
	public void AjouterVache ( int i  , Vache v) {
        
	    
        try {
            
                  Statement ste = db.createStatement();
              String req1 = "INSERT INTO `vache ` (`ID_Vache`, `ID_Agri`, `ID_VÈt`, `Race` , `Age`,`Sexe`,`Vaccin`,`Dossie_MÈdical`, `PÈriode_Chaleur`) VALUES ('"+v.getID_Vache()+"','"+v.getID_Agri()+"','"+v.getID_VÈt()+"','"+v.getRace()+"','"+v. getAge()+"','"+v.getSexe()+"','"+v.getVaccin()+"','"+v.getDossie_MÈdical()+"','"+v.isPÈriode_Chaleur()+"','"+i+"','"+0+"');";
                         
              ste.executeUpdate(req1);
       
             System.out.println("Ajout√© !!");
              }
      catch (SQLException ex) {
           
            System.out.println("\n Erreur lors de l'ajout d'une vache  \n"+ex);
       }
	}

	public void SupprimerVache( Vache c, int ID_Vache) {
	    
	    try{
	        String sql = "select * from `vache` where id ='"+c.getID_Vache()+"'";
	        ResultSet result ;
	         Statement ste = db.createStatement();
	     result = ste.executeQuery(sql);
	while(result.next()){
	       
	        c.setID_Vache(result.getInt(1));
	        System.out.println("id = "+c.getID_Vache());//retourne l'id user qui est auto incr√©ment√© dans la base 
	        PreparedStatement prep = db.prepareStatement("delete  from `vache` where id='"+ID_Vache+"'");
	    
	        prep.executeUpdate();
	       System.out.println("SupprimerVache done 2 \n");
	       
	    }
	       
	} catch (SQLException ex) {
	      System.out.println("SupprimerVache failed \n"+ex);
	
	}
	    
  }
	
	
	public void ModifierOffre(int t , Vache h) {
	    try {   
	       
	  String sql1 = "UPDATE `vache`  SET `Race`='" + h.getRace() + "',`Age`='" + h.getAge() +"',`Sexe`='"+h.getSexe()+"',`Vaccin`= '"+h.getVaccin()+"' ,`Dossie_MÈdical` ='"+h.getDossie_MÈdical()+"',`PÈriode_Chaleur` ='"+h.isPÈriode_Chaleur()+"' WHERE id ='" +t+ "';";

	   PreparedStatement ste1 = db.prepareStatement(sql1);
	   ste1.executeUpdate();
	   System.out.println("La vache : "+h.getID_Vache()+" is updated");
	  }
	  catch(SQLException ex){
	      
	      System.out.println("Update failed "+ex);
	      System.out.println("\n or ID doesn't exist ");
	  }
	}
	
}	

