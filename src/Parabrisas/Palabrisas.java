/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parabrisas;

/**
 *
 * @author nazar
 */
public class Palabrisas {

    private int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Palabrisas(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getEstado() {
        return switch (velocidad) {
            case 1 ->
                "Velocidad lenta";
            case 2 ->
                "Velocidad media";
            case 3 ->
                "Velocidad rápida";
            default ->
                "Apagado";
        };
    }
}
