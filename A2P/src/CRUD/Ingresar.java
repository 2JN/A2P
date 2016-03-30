package CRUD;

import Conexion.Enlace;
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
                + proyecto.getFechaFinalizacion() + "','"
                + proyecto.getNombreGrupo() + "','"
                + proyecto.getDescripcionGrupo() + "','"
                + ")";
        
        miConexion.insertar(sql);
    }
    
    public void ingresarInvestigador( Investigador investigador )
    {
        investigador = new Investigador();
        
        investigador.setDpi();
        investigador.setNombre();
        investigador.setApellido();
        investigador.setDireccion();
        investigador.setTelefono();
        investigador.setEmail();
        investigador.setGradoAcademico();
        investigador.setEspecialidad();
        investigador.setFechaInicioLabor();
        investigador.setNombreGrupo();
        
        //Hacer los Query's para ingresarlo a la base de datos
    }
    
    public void ingresarAdministrador( Administrador administrador )
    {
        administrador = new Administrador();
        
        administrador.setClave();
        administrador.setContrasenia();
        administrador.setNombre();
        administrador.setApellido();
        administrador.setDireccion();
        administrador.setTelefono();
        administrador.setEmail();
        
        //Hacer los Query's para ingresarlo a la base de datos
    }
}
