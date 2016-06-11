package CRUD;

import ClasesTipo.Inversionista;
import ClasesTipo.Administrador;
import ClasesTipo.Proyecto;
import ClasesTipo.Inversion;
import ClasesTipo.Grupo;
import ClasesTipo.Investigador;
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
        Date dNow = new Date();        
        
        Proyecto miProyecto = new Proyecto(123, "proyecto", "una descripcion", 
                100000,dNow, dNow, arregloInversion, arregloGrupo);
        Ingresar ing = new Ingresar();
        ing.ingresarProyecto(miProyecto);
        
        //prueba investigador
        Investigador inv = new Investigador(147, dNow, "una", "mierda" , 
                "co", "co", "co", 123, "co");
        ing.ingresarInvestigador(inv);
    }
    
}
