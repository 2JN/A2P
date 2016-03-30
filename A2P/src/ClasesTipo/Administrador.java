/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;

/**
 *
 * @author josuechaqui
 * Clase que contiene los datos del administrador del sistema 
 */

//inicio de la clase 
public class Administrador extends Persona {
private int clave;
private String contrasenia;
//creacion de los metodos set y get 

    public Administrador(int clave, String contrasenia, String nombre, 
            String apellido, String direccion, Integer telefono,String email) {
        super(nombre,apellido,direccion,telefono,email);
        this.clave = clave;
        this.contrasenia = contrasenia;

    }
    
    public int getClave() {
        return clave;
    }
    
    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContraseña(String contraseña) {
        this.contrasenia = contrasenia;
    }

}
