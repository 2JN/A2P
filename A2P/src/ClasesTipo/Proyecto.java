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
 * Clase que contiene los datos del Proyecto quien es su inversionista y grupo de investigacion 
 * 
 */
public class Proyecto {
   private  String nombreProyecto;
   private  String descripcionProyecto;
   private  double presupuesto;
   private  Date fechaInicio;
   private Date fechaFinal;
   private Inversion[] inversiones;
   private Grupo grupoEncargado;

    public Proyecto(String nombreProyecto, String descripcionProyecto, double presupuesto, Date fechaInicio, Date fechaFinal, Inversion[] inversiones, Grupo grupoEncargado) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.inversiones = inversiones;
        this.grupoEncargado = grupoEncargado;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Inversion[] getInversiones() {
        return inversiones;
    }

    public void setInversiones(Inversion[] inversiones) {
        this.inversiones = inversiones;
    }

    public Grupo getGrupoEncargado() {
        return grupoEncargado;
    }

    public void setGrupoEncargado(Grupo grupoEncargado) {
        this.grupoEncargado = grupoEncargado;
    }
   
}
