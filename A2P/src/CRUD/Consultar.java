package CRUD;
import ClasesTipo.Administrador;
import ClasesTipo.Grupo;
import ClasesTipo.Inversion;
import ClasesTipo.Inversionista;
import ClasesTipo.Investigador;
import ClasesTipo.Persona;
import ClasesTipo.Proyecto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultar {
    
    public ArrayList<Inversionista> consultarInversionista(Connection con, 
        String nombre, String apellido){
        
        ArrayList<Inversionista> inv = new ArrayList<Inversionista>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        ResultSet rsInv = null;
        
        //regresar todos los datos de la tabla
        if(nombre.isEmpty() && apellido.isEmpty()){
            
            try{
                //Obtener los NIT de los inversionistas para hacer una sumatoria
                //De las cantiades de inversión
                pst = con.prepareStatement("SELECT * FROM Inversionista");
                rs = pst.executeQuery();
                
                while(rs.next()){
                    int ttlInv = 0;
                    
                    rsInv = con.prepareStatement("SELECT cantidadInversion "
                            +"FROM Inversion WHERE Inversionista_nit='"
                            + rs.getInt(1) + "'")
                    .executeQuery();
                    
                    while(rsInv.next()){
                        ttlInv += rs.getInt(1);
                    }
                    
                    Inversionista pr = new Inversionista(rs.getInt(1), ttlInv, 
                            rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getInt(5), rs.getString(6));
                    inv.add(pr);
                }
            } catch(SQLException ex){

            }
        }
        
        //busqueda por nombre  y apellido
        else if(!nombre.isEmpty() && !apellido.isEmpty()){
            
            try{
                //Obtener los NIT de los inversionistas para hacer una sumatoria
                //De las cantiades de inversión
                pst = con.prepareStatement("SELECT * FROM Inversionista "
                        + "WHERE nombre='" + nombre 
                        + "' AND apellido='" + apellido + "'");
                rs = pst.executeQuery();
                
                while(rs.next()){
                    int ttlInv = 0;
                    
                    rsInv = con.prepareStatement("SELECT cantidadInversion "
                            +"FROM Inversion WHERE Inversionista_nit='"
                            + rs.getInt(1) + "'")
                    .executeQuery();
                    
                    while(rsInv.next()){
                        ttlInv += rs.getInt(1);
                    }
                    
                    Inversionista pr = new Inversionista(rs.getInt(1), ttlInv, 
                            rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getInt(5), rs.getString(6));
                    inv.add(pr);
                }
            } catch(SQLException ex){

            }
        }
        
        //busqueda por nombre
        else if(!nombre.isEmpty() && apellido.isEmpty()){
            
            try{
                //Obtener los NIT de los inversionistas para hacer una sumatoria
                //De las cantiades de inversión
                pst = con.prepareStatement("SELECT * FROM Inversionista "
                        + "WHERE nombre='" + nombre + "'");
                rs = pst.executeQuery();
                
                while(rs.next()){
                    int ttlInv = 0;
                    
                    rsInv = con.prepareStatement("SELECT cantidadInversion "
                            +"FROM Inversion WHERE Inversionista_nit='"
                            + rs.getInt(1) + "'")
                    .executeQuery();
                    
                    while(rsInv.next()){
                        ttlInv += rs.getInt(1);
                    }
                    
                    Inversionista pr = new Inversionista(rs.getInt(1), ttlInv, 
                            rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getInt(5), rs.getString(6));
                    inv.add(pr);
                }
            } catch(SQLException ex){

            }
        }
        
        //busqueda por apellido
        else if(nombre.isEmpty() && !apellido.isEmpty()){
            
            try{
                //Obtener los NIT de los inversionistas para hacer una sumatoria
                //De las cantiades de inversión
                pst = con.prepareStatement("SELECT * FROM Inversionista "
                        + "WHERE apellido='" + apellido + "'");
                rs = pst.executeQuery();
                
                while(rs.next()){
                    int ttlInv = 0;
                    
                    rsInv = con.prepareStatement("SELECT cantidadInversion "
                            +"FROM Inversion WHERE Inversionista_nit='"
                            + rs.getInt(1) + "'")
                    .executeQuery();
                    
                    while(rsInv.next()){
                        ttlInv += rs.getInt(1);
                    }
                    
                    Inversionista pr = new Inversionista(rs.getInt(1), ttlInv, 
                            rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getInt(5), rs.getString(6));
                    inv.add(pr);
                }
            } catch(SQLException ex){

            }
        }
        
        return inv;
    }
    
    public ArrayList<Proyecto> consultarProyecto(Connection con, String nombre){
        ArrayList<Proyecto> pro = new ArrayList<Proyecto>();
        ResultSet rs = null;
        ResultSet rsInn = null;
        ResultSet rsInv = null;
        ResultSet rsGpr = null;
        ResultSet rsInves = null;
        
        if(nombre.isEmpty()){
            try {
                //obtener informacion de proyecto
                rs = con.prepareStatement("SELECT * FROM Proyecto")
                        .executeQuery();

                while(rs.next()){
                    //guardar la info. de los inversionistas de cada proyecto
                    ArrayList<Inversion> listaInvProy = new ArrayList<>();
                    
                    //guardar la info. de los investigadores de grupos
                    ArrayList<Investigador> inves = new ArrayList<>();
                    Grupo grupo = null;
                    
                    //obtener la informacion de inversion
                    rsInn = con.prepareStatement("SELECT Inversionista_nit, "
                            + "cantidadInversion FROM Inversion WHERE "
                            + "Proyecto_idProyecto='" + rs.getInt(1) + "'")
                            .executeQuery();
                    
                    while(rsInn.next()){
                        
                        //obtener informacion del Inversionista
                        rsInv = con.prepareStatement("SELECT * FROM "
                                + "Inversionista WHERE nit='"
                                + rsInn.getInt(1) +"'")
                                .executeQuery();
                        
                        while(rsInv.next()){
                            Inversionista inv = new Inversionista(
                                    rsInv.getInt(1), 
                                    rsInv.getString(2),
                                    rsInv.getString(3),
                                    rsInv.getString(4),
                                    rsInv.getInt(5),
                                    rsInv.getString(6)
                            );
                            
                            //monto, inversor
                            listaInvProy.add(
                                    new Inversion(rsInn.getDouble(2), inv));
                        }
                    }
                    
                    //obtener la informacion de grupo de desarrollo
                    rsGpr = con.prepareStatement("SELECT Investigador_dpi, "
                            + "nombreGrupo FROM GrupoDesarrollo WHERE "
                            + "Proyecto_idProyecto='" + rs.getInt(1) + "'")
                            .executeQuery();
                    
                    while(rsGpr.next()){
                        
                        //obtener la informacion de los investigadores
                        rsInves = con.prepareStatement("SELECT * FROM "
                                + "Investigador WHERE dpi='"
                                + rsGpr.getInt(1) + "'")
                                .executeQuery();
                        
                        while(rsInves.next()){
                            Investigador nvs = new Investigador(
                                    rsInves.getInt(1), rsInves.getDate(7),
                                    rsInves.getString(8), rsInves.getString(9),
                                    rsInves.getString(2), rsInves.getString(3),
                                    rsInves.getString(4), rsInves.getInt(5),
                                    rsInves.getString(6));
                            
                            inves.add(nvs);
                        }
                        
                        grupo = new Grupo(rsGpr.getString(2), inves);
                    }
                    
                    pro.add(new Proyecto(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getFloat(4), rs.getDate(5),
                            rs.getDate(6), listaInvProy, grupo));
                }
            } catch(SQLException ex) {

            }
        }
        
        else if(!nombre.isEmpty()){
            try {
                //obtener informacion de proyecto
                rs = con.prepareStatement("SELECT * FROM "
                        + "Proyecto WHERE nombreProyecto='" + nombre + "'")
                        .executeQuery();

                while(rs.next()){
                    //guardar la info. de los inversionistas de cada proyecto
                    ArrayList<Inversion> listaInvProy = new ArrayList<>();
                    
                    //guardar la info. de los investigadores de grupos
                    ArrayList<Investigador> inves = new ArrayList<>();
                    Grupo grupo = null;
                    
                    //obtener la informacion de inversion
                    rsInn = con.prepareStatement("SELECT Inversionista_nit, "
                            + "cantidadInversion FROM Inversion WHERE "
                            + "Proyecto_idProyecto='" + rs.getInt(1) + "'")
                            .executeQuery();
                    
                    while(rsInn.next()){
                        
                        //obtener informacion del Inversionista
                        rsInv = con.prepareStatement("SELECT * FROM "
                                + "Inversionista WHERE nit='"
                                + rsInn.getInt(1) +"'")
                                .executeQuery();
                        
                        while(rsInv.next()){
                            Inversionista inv = new Inversionista(
                                    rsInv.getInt(1), 
                                    rsInv.getString(2),
                                    rsInv.getString(3),
                                    rsInv.getString(4),
                                    rsInv.getInt(5),
                                    rsInv.getString(6)
                            );
                            
                            //monto, inversor
                            listaInvProy.add(
                                    new Inversion(rsInn.getDouble(2), inv));
                        }
                    }
                    
                    //obtener la informacion de grupo de desarrollo
                    rsGpr = con.prepareStatement("SELECT Investigador_dpi, "
                            + "nombreGrupo FROM GrupoDesarrollo WHERE "
                            + "Proyecto_idProyecto='" + rs.getInt(1) + "'")
                            .executeQuery();
                    
                    while(rsGpr.next()){
                        
                        //obtener la informacion de los investigadores
                        rsInves = con.prepareStatement("SELECT * FROM "
                                + "Investigador WHERE dpi='"
                                + rsGpr.getInt(1) + "'")
                                .executeQuery();
                        
                        while(rsInves.next()){
                            Investigador nvs = new Investigador(
                                    rsInves.getInt(1), rsInves.getDate(7),
                                    rsInves.getString(8), rsInves.getString(9),
                                    rsInves.getString(2), rsInves.getString(3),
                                    rsInves.getString(4), rsInves.getInt(5),
                                    rsInves.getString(6));
                            
                            inves.add(nvs);
                        }
                        
                        grupo = new Grupo(rsGpr.getString(2), inves);
                    }
                    
                    pro.add(new Proyecto(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getFloat(4), rs.getDate(5),
                            rs.getDate(6), listaInvProy, grupo));
                }
            } catch(SQLException ex) {

            }
        }
        
        return pro;
    }
    
    public ArrayList<Investigador> consultarInvestigador(Connection con, 
            String nombre, String apellido){
        
        ArrayList<Investigador> investigador = new ArrayList<>();
        ResultSet rs = null;
        
        if(nombre.isEmpty() && apellido.isEmpty()){
            try{
                rs = con.prepareStatement("SELECT * FROM Investigador")
                        .executeQuery();
                
                while(rs.next()){
                    investigador.add(new Investigador(rs.getInt(1),
                            rs.getDate(7), rs.getString(8), rs.getString(9),
                            rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getInt(5), rs.getString(6))
                    );
                }
            } catch(SQLException ex){
            
            }
        }
        
        else if(!nombre.isEmpty() && apellido.isEmpty()){
            try{
                rs = con.prepareStatement("SELECT * FROM Investigador WHERE "
                        + "nombre='" + nombre + "'")
                        .executeQuery();
                
                while(rs.next()){
                    investigador.add(new Investigador(rs.getInt(1),
                            rs.getDate(7), rs.getString(8), rs.getString(9),
                            rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getInt(5), rs.getString(6))
                    );
                }
            } catch(SQLException ex){
            
            }
        }
        
        else if(nombre.isEmpty() && !apellido.isEmpty()){
            try{
                rs = con.prepareStatement("SELECT * FROM Investigador WHERE "
                        + "apellido='" + apellido + "'")
                        .executeQuery();
                
                while(rs.next()){
                    investigador.add(new Investigador(rs.getInt(1),
                            rs.getDate(7), rs.getString(8), rs.getString(9),
                            rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getInt(5), rs.getString(6))
                    );
                }
            } catch(SQLException ex){
            
            }
        }
        
        else if(!nombre.isEmpty() && !apellido.isEmpty()){
            try{
                rs = con.prepareStatement("SELECT * FROM Investigador WHERE "
                        + "nombre='" + nombre + "' AND apellido='"
                        + apellido + "'")
                        .executeQuery();
                
                while(rs.next()){
                    investigador.add(new Investigador(rs.getInt(1),
                            rs.getDate(7), rs.getString(8), rs.getString(9),
                            rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getInt(5), rs.getString(6))
                    );
                }
            } catch(SQLException ex){
                
            }
        }
        
        return investigador;
    }
    
    public Administrador consultarAdministrador(Connection con){
        Administrador admin = null;
        ResultSet rs = null;
        
        try{
            rs = con.prepareStatement("SELECT * FROM Administrador")
                    .executeQuery();
            
            rs.next();
            
            admin = new Administrador(rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getString(7));
            
        } catch(SQLException ex){
        
        }
        
        return admin;
    }
}
