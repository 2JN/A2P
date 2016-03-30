package CRUD;

/**
 *
 * @author felepo
 */
public class Ingresar 
{
    public void ingresarInversionista( Inversionista inversionista )
    {
        inversionista = new Inversionista();
        
        inversionista.setNombre();
        inversionista.setApellido();
        inversionista.setDireccion();
        inversionista.setTelefono();
        inversionista.setEmail();
        inversionista.setNit( /*desde la caja de texto*/ );
        inversionista.setCantidadInversion( /*desde la caja de texto*/ );
        
        //Hacer los Query's para ingresarlo a la base de datos
    }
    
    public void ingresarProyecto( Proyecto proyecto )
    {
        proyecto = new Proyecto();
        
        proyecto.setNombreProyecto();
        proyecto.setDescripcionProyecto();
        proyecto.setPresupuesto();
        proyecto.setFechaInicio();
        proyecto.setFechaFinalizacion();
        proyecto.setNombreGrupo();
        proyecto.setDescripcionGrupo();
        
        //Hacer los Query's para ingresarlo a la base de datos
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
