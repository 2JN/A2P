/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 * clase que contiene los detos del grupo y los investigadores que pertenecen 
 * al mismo 
 */
public class Grupo {
    private String nombreGrupo;
    private ArrayList<Investigador> investigadores;

    public Grupo(String nombreGrupo, ArrayList<Investigador> investigadores) {
        this.nombreGrupo = nombreGrupo;
        this.investigadores = investigadores;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public ArrayList<Investigador> getImvestigadores() {
        return investigadores;
    }

    public void setImvestigadores(ArrayList<Investigador> imvestigadores) {
        this.investigadores = imvestigadores;
    }
    
}
