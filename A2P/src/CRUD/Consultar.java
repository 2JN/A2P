package CRUD;
import ClasesTipo.Inversionista;
import ClasesTipo.Persona;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultar {
    
    public ArrayList<Inversionista> consultarInversionista(Connection con, 
        String nombre, String apellido){
        
        ArrayList<Inversionista> inv = new ArrayList<Inversionista>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        ResultSet rsInv = null;
        
        if(!nombre.isEmpty() && apellido.isEmpty()){
            
            try{
                //Obtener los NIT de los inversionistas para hacer una sumatoria
                //De las cantiades de inversión
                pst = con.prepareStatement("SELECT * FROM Inversionista "
                    + "WHERE nombre='" + nombre + "'");
                rs = pst.executeQuery();
                
                while(rs.next()){
                    int ttlInv = 0;
                    
                    rsInv = con.prepareStatement("SELECT cantidadInversion "
                    +"FROM Inversion WHERE Inversionista_nit='"
                    + rs.getInt(1) + "'")
                    .executeQuery();
                    
                    while(rsInv.next()){
                        ttlInv += rs.getInt(1);
                    }
                    
                    Inversionista pr = new Inversionista(rs.getInt(1), ttlInv, 
                        rs.getString(2), rs.getString(3), rs.getString(4), 
                        rs.getInt(5), rs.getString(6));
                    inv.add(pr);
                }
            } catch(SQLException ex){

            } finally {
                
            }
        }
        
        return inv;
    }
}
