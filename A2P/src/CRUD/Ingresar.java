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
                + inversionista.getNombre() + "','"
                + inversionista.getApellido() + "','"
                + inversionista.getDireccion() + "','"
                + inversionista.getTelefono() + "','"
                + inversionista.getEmail() + "','"
                + inversionista.getNit() + "','"
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
                + proyecto.getNombreProyecto() + "','"
                + proyecto.getDescripcionProyecto() + "','"
                + proyecto.getPresupuesto() + "','"
                + proyecto.getFechaInicio() + "','"
                + proyecto.getFechaFinal() + "','"
                + proyecto.getGrupoEncargado() + ")";
        
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
                + investigador.getGradoAcademico() + "','"
                + investigador.getEspecialidad() + "','"
                + investigador.getFechaInicioLabor() + ")";
        
                miConexion.insertar(sql);
    }
    
    public void ingresarAdministrador( Administrador administrador )
    {
        Enlace miConexion = new Enlace();

        String sql;
        
        sql = "INSERT INTO Inversionista"
                + "VALUES('"
                + administrador.getClave() + "','"
                + administrador.getContrasenia() + ")";
        
        miConexion.insertar(sql);
    }
}
