package DB;

import java.sql.Connection;


public class testConnexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection sn = MyConnexion.Get_Instance().getCon();
            
        } catch (Exception e) {
        }
        
    }
    
}
