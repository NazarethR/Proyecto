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

    public Luces() {
        this.actuales = TemaDeLuces.APAGADO;
    }

    public void luzBajaEncendida() {
        actuales = actuales.LUCESBAJAS;
    }

    public void luzAltaEncendidas() {
        actuales = actuales.LUCESALTAS;
    }

    public void luzApagadas() {
        actuales = actuales.APAGADO;

    }

    public TemaDeLuces getActuales() {
        return actuales;
    }

    
}
