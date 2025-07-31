/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alarma_y_Bloqueo;

import SistemaIluminaciones.Luces;
import SistemaDePuertas.Puertas;

/**
 *
 * @author nazar
 */
public class AlarmaBloqueo {

    private boolean puertasBloqueadas;
    private Luces lucesAlarma;

    public AlarmaBloqueo(Luces lucesAlarma) {
        this.lucesAlarma = lucesAlarma;
        this.puertasBloqueadas = false;
    }

    public void setLucesAlarma(Luces lucesAlarma) {
        this.lucesAlarma = lucesAlarma;
    }

    public Luces getLucesAlarma() {
        return lucesAlarma;
    }

    public boolean estanPuertasBloqueadas() {
        return puertasBloqueadas;
    }

    // Activa bloqueo y enciende luces de emergencia
    public void activarBloqueo() {
        puertasBloqueadas = true;
        lucesEmergenciaAlarma();
    }

    // Desactiva bloqueo y apaga las luces
    public void desactivarBloqueo() {
        puertasBloqueadas = false;
        if (lucesAlarma != null) {
            lucesAlarma.luzApagadas();
        }
    }

    // Intenta abrir una puerta solo si no están bloqueadas
    public boolean intentarAbrirPuerta(int numPuerta) {
        if (puertasBloqueadas) {
            // No se puede abrir
            return false;
        } else {
            // Se podría implementar apertura física si se usa clase Puertas
            return true;
        }
    }

    // Parpadeo de luces de emergencia
    private void lucesEmergenciaAlarma() {
        if (lucesAlarma != null) {
            try {
                for (int i = 0; i < 6 && puertasBloqueadas; i++) {
                    lucesAlarma.luzAltaEncendidas();
                    lucesAlarma.lucesFrenoEncendidas();
                    Thread.sleep(500);
                    lucesAlarma.luzApagadas();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                // Manejo silencioso de la excepción
            }
        }
    }
}
