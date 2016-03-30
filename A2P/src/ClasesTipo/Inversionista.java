/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;

/**
 *
 * @author usuario
 */
public class Inversionista extends Persona{
    private int nit;
    private double cantidadInversion;

    public Inversionista(int nit, double cantidadInversion,String nombre, String apellido, String direccion, Integer telefono,
            String email) {
        super(nombre,  apellido,  direccion,  telefono, email);
        this.nit = nit;
        this.cantidadInversion = cantidadInversion;
        
    }

    
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public double getCantidadInversion() {
        return cantidadInversion;
    }

    public void setCantidadInversion(double cantidadInversion) {
        this.cantidadInversion = cantidadInversion;
    }
    
}
