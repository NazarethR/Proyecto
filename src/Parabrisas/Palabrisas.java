/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parabrisas;

/**
 *
 * @author nazar
 */
public class Palabrisas  {
  private SistemaEncendido motor; // referencia al sistema de encendido
    private int velocidad; // 0 = apagado, 1-3 = niveles de velocidad

    public Palabrisas(SistemaEncendido motor) {
        this.motor = motor;
        this.velocidad = 0; // apagado por defecto
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        // Solo cambia la velocidad si el motor está encendido
        if (motor.estaEncendido()) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = 0; // forzar apagado si el motor no está encendido
        }
    }

    public String obtenerEstado() {
        if (!motor.estaEncendido()) {
            return "Motor apagado. Palabrisas desactivado.";
        }

        return switch (velocidad) {
            case 1 -> "Velocidad lenta";
            case 2 -> "Velocidad media";
            case 3 -> "Velocidad rápida";
            default -> "Palabrisas apagado";
        };
    }

    
}
