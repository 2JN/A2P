package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultar {
    public ResultSet consultarInversionista(Connection cn, String nombre,
        String apellido, String direccion, String telefono){
        ResultSet st = null;
        
        if(!nombre.isEmpty() && apellido.isEmpty() && direccion.isEmpty() &&
            telefono.isEmpty()){
            
            try{
                PreparedStatement pst = cn.prepareStatement("SELECT " + nombre + 
                    "FROM ");
                ResultSet rs = pst.executeQuery();
            } catch(SQLException ex){

            } finally {
                return st;
            }
        }
    }
}
