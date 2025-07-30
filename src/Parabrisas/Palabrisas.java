/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parabrisas;

import SistemaEncendido.Motor;

/**
 *
 * @author nazar
 */
public class Palabrisas {

    private Motor motor; // dependencia
    private int velocidad;     
    
    public Palabrisas(Motor motor) {
        this.motor = motor;
        this.velocidad = 0;
    }

    public void setVelocidad(int velocidad) {
        if (motor.estaEncendido()) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = 0; // se apaga si el motor está apagado
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String obtenerEstado() {
        if (!motor.estaEncendido()) {
            return "Motor apagado. Palabrisas apagado.";
        }

        return switch (velocidad) {
            case 1 ->
                "Velocidad lenta";
            case 2 ->
                "Velocidad media";
            case 3 ->
                "Velocidad rápida";
            default ->
                "Palabrisas apagado";
        };
    }

}
