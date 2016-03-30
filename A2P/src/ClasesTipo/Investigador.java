/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;
import java.util.Date;
/**
 *
 * @author josuechaqui
 * clase para definir los campos de datos del Investigador
 */

//inicio de la clase 
public class Investigador extends Persona {
    private Integer dpi;
    private Date fechaInicioLabor;
    private String gradoAcademico;
    private String especialidad;

    //constructor de la clase investigador con llamado a la superclase Persona
    public Investigador(Integer dpi, Date fechaInicionLabor, String gradoAcademico, 
            String especialidad, String nombre, String apellido,
            String direccion, Integer telefono, String email) {
        
        super(nombre, apellido, direccion, telefono, email);
        this.dpi = dpi;
        this.fechaInicioLabor = fechaInicioLabor;
        this.gradoAcademico = gradoAcademico;
        this.especialidad = especialidad;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public Date getFechaInicioLabor() {
        return fechaInicioLabor;
    }

    public void setFechaInicioLabor(Date fechaInicioLabor) {
        this.fechaInicioLabor = fechaInicioLabor;
    }

    

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
