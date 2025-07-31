/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlKilometraje;

import SistemaEncendido.Motor;
/**
 *
 * @author duvan
 */
public class Kilometraje {
    private int velocidad;
    private double Kilometraje;
    private double RPM;
    private Motor EstadoMotor;

    public Motor getEstadoMotor() {
        return EstadoMotor;
    }

    public void setEstadoMotor(Motor EstadoMotor) {
        this.EstadoMotor = EstadoMotor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(double Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public double getRPM() {
        return RPM;
    }

    public void setRPM(double RPM) {
        this.RPM = RPM;
    }

    public Kilometraje() {
        this.velocidad = 0;
        this.Kilometraje = 0;
        this.RPM = 0;
        this.EstadoMotor = new Motor();
    }
    
    public void Acelerar(){
        velocidad++;
    }
    
    public void Frenar(){
        if(this.velocidad>0)
         velocidad--;
    }
    
    public void ObtenerRPM(){
        if(this.EstadoMotor.estaEncendido() && 0==velocidad){
            RPM=800;
        }else if (velocidad>0){
            RPM= velocidad*50;
        }         
    }
    
}
