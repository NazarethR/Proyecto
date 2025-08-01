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
    private int Cantidad;
    private int Consumo;
    private Motor motorEstado;

    public int getCantidad() {
        return Cantidad;
    }

    public int getConsumo() {
        return Consumo;
    }

    public Motor getMotorEstado() {
        return motorEstado;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setConsumo(int Consumo) {
        this.Consumo = Consumo;
    }

    public Combustible() {
        this.Cantidad = 100;
        this.Consumo = 1;
        this.motorEstado = new Motor();
    }

    public int RecargarGasolina(){
        return 100;
    }
    
    public int ObtenerCantidad(){
        return Cantidad;
    }
    
    public void GastarGasolina(){
        if(motorEstado.estaEncendido())
        Cantidad=Cantidad - Consumo;
    }
}
