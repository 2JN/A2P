/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;

/**
 *
 * @author usuario
 * Esta clase es la principal para los tipos de indentidad que identifican a  
 * personas en la organizacion de proyectos 
 */
//inicio de la clase
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected Integer telefono;
    protected String email;

    //constructor de la clase
    public Persona(String nombre, String apellido, String direccion, Integer telefono,
            String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    

    //metodos set y get para cada variable
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
//cierre de la clase