package CRUD;

/**
 *
 * @author felepo
 */
public class Ingresar 
{
    public void ingresarInversionista( Inversionista inversionista)
    {
        inversionista = new Inversionista();
        
        inversionista.setNit( /*desde la caja de texto*/ );
        inversionista.setCantidadInversion( /*desde la caja de texto*/ );
    }
    
    public void ingresarProyecto( Proyecto proyecto )
    {
        proyecto = new Proyecto();
        
        proyecto.setNombre();
        proyecto.setDescripcionProyecto();
        proyecto.setPresupuesto();
        proyecto.setFechaInicio();
        proyecto.setFechaFinalizacion();
    }
    
    public void ingresarInvestigador( Investigador investigador )
    {
        investigador = new Investigador();
        
        investigador.setGradoAcademico();
        investigador.setEspecialidad();
        investigador.setFechaInicioLabor();
        investigador.setDpi();
    }
    
    public void ingresarAdministrador( Administrador administrador )
    {
        administrador = new Administrador();
        
        administrador.setContrasenia();
    }
}
