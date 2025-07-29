/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaIluminaciones;

/**
 *
 * @author danny
 */
public class Luces {

    private TemaDeLuces actuales;
    private Motor motor;

    public Luces(Motor motor) {
        this.actuales = TemaDeLuces.APAGADO;
        this.motor = motor;
    }

    private boolean puedeEncenderLuces() {
        return motor != null && motor.estaEncendido();
    }

    public void luzBajaEncendida() {
        if (puedeEncenderLuces()) {
            actuales = TemaDeLuces.LUCESBAJAS;
        }
    }

    public void luzAltaEncendidas() {
        if (puedeEncenderLuces()) {
            actuales = TemaDeLuces.LUCESALTAS;
        }
    }

    public void intermitentesEncendidas() {
        if (puedeEncenderLuces()) {
            actuales = TemaDeLuces.INTERMITENTES;
        }
    }

    public void direccionalIzquierdaEncendida() {
        if (puedeEncenderLuces()) {
            actuales = TemaDeLuces.DIRECCIONALES_IZQUIERDA;
        }
    }

    public void direccionalDerechaEncendida() {
        if (puedeEncenderLuces()) {
            actuales = TemaDeLuces.DIRECCIONALES_DERECHA;
        }
    }

    public void lucesFrenoEncendidas() {
        if (puedeEncenderLuces()) {
            actuales = TemaDeLuces.LUCES_FRENO;
        }
    }

    public void luzApagadas() {
        actuales = actuales.APAGADO;

    }

    public TemaDeLuces getActuales() {
        return actuales;
    }

}
