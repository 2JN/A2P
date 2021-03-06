/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;
import java.util.ArrayList;
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
      private ArrayList<Inversion> inversiones;
   private ArrayList<Grupo>  nombreGrupo;
   private int idProyecto;
    public Proyecto(int idProyecto , String nombreProyecto, String descripcionProyecto, 
            double presupuesto, Date fechaInicio, Date fechaFinal, ArrayList<Inversion>  inversiones, ArrayList<Grupo> nombreGrupo) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.inversiones = inversiones;
        this.nombreGrupo = nombreGrupo;
        this.idProyecto =idProyecto ;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
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

    public ArrayList<Inversion>      getInversiones() {
        return inversiones;
    }

    public void setInversiones(ArrayList<Inversion>  inversiones) {
        this.inversiones = inversiones;
    }

    public ArrayList<Grupo> getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(ArrayList<Grupo> nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    

}
