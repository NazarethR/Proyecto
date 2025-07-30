/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaClimatizacion;

/**
 *
 * @author duvan
 */
public enum VelocidadVen {
    APAGADO("Apagado"), BAJA("Velocidad baja"), ALTA("Alta velocidad");

    private String Velocidad;

    public String getVelocidad() {
        return Velocidad;
    }

    private VelocidadVen(String Velocidad) {
        this.Velocidad = Velocidad;
    }

}
