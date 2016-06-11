package CRUD;

import ClasesTipo.Inversionista;
import ClasesTipo.Administrador;
import ClasesTipo.Proyecto;
import ClasesTipo.Inversion;
import ClasesTipo.Grupo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author felepo
 */
public class Prueba {
    
    public static void main( String args[] )
    {   
        Ingresar herramientaIngresar = new Ingresar();
        //Inversionista miInversionista = new Inversionista(123,100000.00,
        //        "Fernando","Poncio","Toto",12345678,"fer@hotmail.com");
        
        //herramientaIngresar.ingresarInversionista(miInversionista);
       
        //Administrador miAdministrador = new Administrador(54645,
        //       "contraseña","Juan","Perez","Xela",78492734,"juan@gmail.com");
       
       //herramientaIngresar.ingresarAdministrador(miAdministrador);
        
        ArrayList<Inversion> arregloInversion = new ArrayList<Inversion>();
        ArrayList<Grupo> arregloGrupo = new ArrayList<Grupo>();
        
        //preuba date 
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
        
        
        Proyecto miProyecto = new Proyecto(123, "proyecto", "una descripcion", 
                100000,dNow, dNow, arregloInversion, arregloGrupo);
        Ingresar ingProy = new Ingresar();
        ingProy.ingresarProyecto(miProyecto);
    }
    
}
