/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTipo;

/**
 *
 * @author josuechaqui
 * informacion sobre el inversionista 
 */
public class Inversion {
    private double monto;
    private Inversionista inversor;

    public Inversion(double monto, Inversionista inversor) {
        this.monto = monto;
        this.inversor = inversor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Inversionista getInversor() {
        return inversor;
    }

    public void setInversor(Inversionista inversor) {
        this.inversor = inversor;
    }
    
}
