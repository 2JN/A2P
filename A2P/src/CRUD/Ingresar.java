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
        
        String sql;
        
        sql = "INSERT INTO Inversionista"
                + "VALUES('"
                + inversionista.getNit() + "','"
                + inversionista.getNombre() + "','"
                + inversionista.getApellido() + "','"
                + inversionista.getDireccion() + "','"
                + inversionista.getTelefono() + "','"
                + inversionista.getEmail() + "','"
                + inversionista.getCantidadInversion()
                + ")";
        
        miConexion.insertar(sql);
    }
    
    public void ingresarProyecto( Proyecto proyecto )
    {
        Enlace miConexion = new Enlace();
        
        String sql;
        
        sql = "INSERT INTO Inversionista"
                + "VALUES('"
                + proyecto.getIdProyecto() + "','"
                + proyecto.getNombreProyecto() + "','"
                + proyecto.getDescripcionProyecto() + "','"
                + proyecto.getPresupuesto() + "','"
                + proyecto.getFechaInicio() + "','"
                + proyecto.getFechaFinal() + "','"
                + proyecto.getNombreGrupo() + ")";
        
        miConexion.insertar(sql);
    }
    
    public void ingresarInvestigador( Investigador investigador )
    {
        Enlace miConexion = new Enlace();
        
        String sql;
        
        sql = "INSERT INTO Inversionista"
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
        
                miConexion.insertar(sql);
    }
    
    public void ingresarAdministrador( Administrador administrador )
    {
        Enlace miConexion = new Enlace();

        String sql;
        
        sql = "INSERT INTO Inversionista"
                + "VALUES('"
                + administrador.getClave() + "','"
                + administrador.getContrasenia() + "','"
                + administrador.getNombre() + "','"
                + administrador.getApellido() + "','"
                + administrador.getDireccion() + "','"
                + administrador.getTelefono() + "','"
                + administrador.getEmail() + ")";
        
        miConexion.insertar(sql);
    }
}
