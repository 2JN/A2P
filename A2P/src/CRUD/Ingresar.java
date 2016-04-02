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
    
    public void ingresarProyecto( Proyecto proyecto ) //pendiente en ingresar nombreGrupo
    {
        Enlace miConexion = new Enlace();
        
        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO Proyecto(idProyecto,nombreProyecto,"
                + "descripcionProyecto,presupuesto,fechaInicio,fechaFinal)"
                        + "VALUES('"
                        + proyecto.getIdProyecto() + "','"
                        + proyecto.getNombreProyecto() + "','"
                        + proyecto.getDescripcionProyecto() + "','"
                        + proyecto.getPresupuesto() + "','"
                        + proyecto.getFechaInicio() + "','"
                        + proyecto.getFechaFinal() + ")";
        
        miConexion.insertar(sentenciaSql);
    }
    
    public void ingresarInvestigador( Investigador investigador )
    {
        Enlace miConexion = new Enlace();
        
        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO Investigador(dpi,fechaInicioLabor,"
                + "gradoAcademico,especialidad,nombre,apellido,direccion,"
                + "telefono,email)"
                        + "VALUES('"
                        + investigador.getDpi() + "','"
                        + investigador.getFechaInicioLabor() + "','"
                        + investigador.getGradoAcademico() + "','"
                        + investigador.getEspecialidad() + "','"
                        + investigador.getNombre() + "','"
                        + investigador.getApellido() + "','"
                        + investigador.getDireccion() + "','"
                        + investigador.getTelefono() + "','"
                        + investigador.getEmail() + ")";
        
                miConexion.insertar(sentenciaSql);
    }
    
    public void ingresarAdministrador( Administrador administrador )
    {
        Enlace miConexion = new Enlace();

        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO Administrador(clave,contrasenia,nombre,"
                + "apellido,direccion,telefono,email)"
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
