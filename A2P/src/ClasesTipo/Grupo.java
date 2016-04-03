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
    private String nombreGrupo;
    private Investigador[] imvestigadores;

    public Grupo(String nombreGrupo, Investigador[] imvestigadores) {
        this.nombreGrupo = nombreGrupo;
        this.imvestigadores = imvestigadores;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }


    public Investigador[] getImvestigadores() {
        return imvestigadores;
    }

    public void setImvestigadores(Investigador[] imvestigadores) {
        this.imvestigadores = imvestigadores;
    }
    
}
