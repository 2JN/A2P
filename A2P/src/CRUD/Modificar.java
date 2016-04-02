package CRUD;
import Conexion.Enlace;
/**
 *
 * @author felepo
 */
public class Modificar 
{
    public void modificarInversionista( int nit, String nombreCampo, 
            String nuevoValor )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql = "UPDATE Inversionista "
                        + "SET " + nombreCampo + " = " + nuevoValor
                        + " WHERE nit = " + nit;
        
        miConexion.insertar( sentenciaSql );
    }
    
    public void modificarProyecto( int idProyecto, String nombreCampo, 
            String nuevoValor )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql = "UPDATE Proyecto "
                        + "SET " + nombreCampo + " = " + nuevoValor
                        + " WHERE idProyecto = " + idProyecto;
        
        miConexion.insertar( sentenciaSql );
    }
    
    public void modificarInvestigador( int dpi, String nombreCampo, 
            String nuevoValor )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql = "UPDATE Investigador "
                        + "SET " + nombreCampo + " = " + nuevoValor
                        + " WHERE dpi = " + dpi;
        
        miConexion.insertar( sentenciaSql );
    }
    
    public void modificarAdministrador( int clave, String nombreCampo, 
            String nuevoValor )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql = "UPDATE Administrador "
                        + "SET " + nombreCampo + " = " + nuevoValor
                        + " WHERE clave = " + clave;
        
        miConexion.insertar( sentenciaSql );
    }
}