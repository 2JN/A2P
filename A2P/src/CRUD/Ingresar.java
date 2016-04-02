package CRUD;

import Conexion.Enlace;
import ClasesTipo.*;
/**
 *
 * @author felepo
 */
public class Ingresar 
{
    public void ingresarInversionista( Inversionista inversionista )
    {
        Enlace miConexion = new Enlace();
        
        String sentenciaSql;
        
        sentenciaSql = "INSERT "
                        + "INTO Inversionista (nit,cantidadInversion,nombre,"
                        + "apellido,direccion,telefono,email) "
                        + "VALUES('"
                        + inversionista.getNit() + "','"
                        + inversionista.getCantidadInversion() + "','"
                        + inversionista.getNombre() + "','"
                        + inversionista.getApellido() + "','"
                        + inversionista.getDireccion() + "','"
                        + inversionista.getTelefono() + "','"
                        + inversionista.getEmail()
                        + ")";
        
        miConexion.insertar(sentenciaSql);
    }
    
    public void ingresarProyecto( Proyecto proyecto )
    {
        Enlace miConexion = new Enlace();
        
        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO Inversionista"
                        + "VALUES('"
                        + proyecto.getIdProyecto() + "','"
                        + proyecto.getNombreProyecto() + "','"
                        + proyecto.getDescripcionProyecto() + "','"
                        + proyecto.getPresupuesto() + "','"
                        + proyecto.getFechaInicio() + "','"
                        + proyecto.getFechaFinal() + "','"
                        + proyecto.getNombreGrupo() + ")";
        
        miConexion.insertar(sentenciaSql);
    }
    
    public void ingresarInvestigador( Investigador investigador )
    {
        Enlace miConexion = new Enlace();
        
        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO Inversionista"
                        + "VALUES('"
                        + investigador.getDpi() + "','"
                        + investigador.getNombre() + "','"
                        + investigador.getApellido() + "','"
                        + investigador.getDireccion() + "','"
                        + investigador.getTelefono() + "','"
                        + investigador.getEmail() + "','"
                        + investigador.getFechaInicioLabor() + "','"
                        + investigador.getGradoAcademico() + "','"
                        + investigador.getEspecialidad() + ")";
        
                miConexion.insertar(sentenciaSql);
    }
    
    public void ingresarAdministrador( Administrador administrador )
    {
        Enlace miConexion = new Enlace();

        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO Inversionista"
                        + "VALUES('"
                        + administrador.getClave() + "','"
                        + administrador.getContrasenia() + "','"
                        + administrador.getNombre() + "','"
                        + administrador.getApellido() + "','"
                        + administrador.getDireccion() + "','"
                        + administrador.getTelefono() + "','"
                        + administrador.getEmail() + ")";
        
        miConexion.insertar(sentenciaSql);
    }
}
