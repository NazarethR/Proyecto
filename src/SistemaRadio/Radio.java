/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author duvan
 */
public class Radio {

    private boolean estado;
    private Modos modo;
    private EstacionesAM estacionAM;
    private EstacionesFM estacionFM;

    public boolean isEstado() {
        return estado;
    }

    public Modos getModo() {
        return modo;
    }

    public EstacionesAM getEstacionAM() {
        return estacionAM;
    }

    public EstacionesFM getEstacionFM() {
        return estacionFM;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setModo(Modos modo) {
        this.modo = modo;
    }

    public void setEstacionAM(EstacionesAM estacionAM) {
        this.estacionAM = estacionAM;
    }

    public void setEstacionFM(EstacionesFM estacionFM) {
        this.estacionFM = estacionFM;
    }

    public Radio(Modos modo) {
        this.estado = false;
        this.modo = modo;
        this.estacionAM = EstacionesAM.RadioChorotega;
        this.estacionFM = EstacionesFM.Radio947;
    }



}
