/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author Fernando Ambrosio
 */
public class Enlace {
    
    public static Connection GetConnection() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            //String password = "";
            String password = "";
            //String password = "123456";
            cn= DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            cn=null;
            System.out.println("Error no se puede cargar el driver:" + e.getMessage());
        } catch (SQLException e) {
            cn=null;
            System.out.println("Error no se establecer la conexion:" + e.getMessage());
        }
        return cn;
    }
        

       
     public ResultSet Consulta(String sql)
                {
                     Connection miConexion=(Connection) Enlace.GetConnection();
                    ResultSet res = null;
                    
                    try
                    {
                        Statement statement=(Statement) miConexion.createStatement();
                        
                        res = statement.executeQuery(sql);
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
     
     public void insertar( String sql )
     {
         Connection miConexion=(Connection) Enlace.GetConnection();
                    
         try
         {
            Statement statement=(Statement) miConexion.createStatement();
            statement.execute( sql );  
            statement.close();
            miConexion.close();
         } catch (Exception e)
         {
         
         }
     }
}
