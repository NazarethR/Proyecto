/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaIluminaciones;

import SistemaDePuertas.Puertas;
import SistemaEncendido.Motor;

/**
 *
 * @author danny
 */
public class Luces {

    private TemaDeLuces actuales;
    private Motor motor;
    private Puertas puertas;

    public Luces() {
        this.actuales = TemaDeLuces.APAGADO;
        this.motor = new Motor();
        this.puertas = new Puertas();

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
        actuales = TemaDeLuces.APAGADO;

    }

    public TemaDeLuces getActuales() {
        return actuales;
    }

    public void luzPuertaAbierta() {
        actuales = TemaDeLuces.LUZ_PUERTA_ABIERTA;
    }

    public void luzAdvertenciaPuerta() {
        for (int i = 0; i < 4; i++) {
            if (puertas.laPuertaEstaAbierta(i)) {
                actuales = TemaDeLuces.LUZ_PUERTA_ABIERTA;
                return;
            }
        }
    }

}
