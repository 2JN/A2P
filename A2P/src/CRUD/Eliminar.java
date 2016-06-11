package CRUD;

/**
 *
 * @author felepo
 */

import Conexion.Enlace;

public class Eliminar 
{
    public void eliminarInversionista( int nit )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql  = "DELETE "
                        + "FROM Inversionista "
                        + "WHERE nit = " + nit;
        
        miConexion.insertar( sentenciaSql );
    }
    
    public void eliminarProyecto( int idProyecto )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql  = "DELETE "
                        + "FROM Proyecto "
                        + "WHERE idProyecto = " + idProyecto;
        
        miConexion.insertar( sentenciaSql );
    }
    
    public void eliminarInvestigador( int dpi )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql  = "DELETE "
                        + "FROM Investigador "
                        + "WHERE dpi = " + dpi;
        
        miConexion.insertar( sentenciaSql );
    }
    
    public void eliminarAdministrador( int clave )
    {
        Enlace miConexion = new Enlace();
        String sentenciaSql;
        
        sentenciaSql  = "DELETE "
                        + "FROM Administrador "
                        + "WHERE clave = " + clave;
        
        miConexion.insertar( sentenciaSql );
    }
}
