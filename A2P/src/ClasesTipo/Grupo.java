/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;

/**
 *
 * @author usuario
 * clase que contiene los detos del grupo y los investigadores que pertenecen 
 * al mismo 
 */
public class Grupo {
    private String nombreGrupo, descripcionGrupo;
    private Investigador[] imvestigadores;

    public Grupo(String nombreGrupo, String descripcionGrupo, 
                Investigador[] imvestigadores) {
        this.nombreGrupo = nombreGrupo;
        this.descripcionGrupo = descripcionGrupo;
        this.imvestigadores = imvestigadores;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDescripcionGrupo() {
        return descripcionGrupo;
    }

    public void setDescripcionGrupo(String descripcionGrupo) {
        this.descripcionGrupo = descripcionGrupo;
    }

    public Investigador[] getImvestigadores() {
        return imvestigadores;
    }

    public void setImvestigadores(Investigador[] imvestigadores) {
        this.imvestigadores = imvestigadores;
    }
    
}
