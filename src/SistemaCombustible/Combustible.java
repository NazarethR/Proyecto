/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCombustible;

import SistemaEncendido.Motor;
/**
 *
 * @author duvan
 */
public class Combustible {
    private double Cantidad;
    private double Consumo;

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double Consumo) {
        this.Consumo = Consumo;
    }

    public Combustible() {
        this.Cantidad = 100;
        this.Consumo = 0.23;
    }
    
    public void RecargarGasolina(){
        Cantidad=100;
    }
    
    public double ObtenerCantidad(){
        return Cantidad;
    }
    
    public void GastarGasolina(){
        Cantidad=Cantidad - Consumo;
    }
}
