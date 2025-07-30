/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaClimatizacion;

/**
 *
 * @author duvan
 */
public class Climatizacion {
    private int Temperatura;
    private VelocidadVen VentiladorVel;
    private boolean AC;
    private boolean Calefaccion;

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public VelocidadVen getVentiladoraVel() {
        return VentiladorVel;
    }

    public void setVentiladoraVel(VelocidadVen VentiladorVel) {
        this.VentiladorVel = VentiladorVel;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public boolean isCalefaccion() {
        return Calefaccion;
    }

    public void setCalefaccion(boolean Calefaccion) {
        this.Calefaccion = Calefaccion;
    }

    public Climatizacion() {
        this.Temperatura = 28;
        this.VentiladorVel = VelocidadVen.APAGADO;
        this.AC = false;
        this.Calefaccion = false;
    }
    
    public void SubirTempetatura(){
        Temperatura++;
    }
    
    public void BajarTempetatura(){
        Temperatura--;
    }
    public void EncenderVentilador(){
        VentiladorVel = VelocidadVen.BAJA;
    }
    public void ApagarVentilador(){
        VentiladorVel = VelocidadVen.APAGADO;
    }
    public void CambiarVelocidad(){
        if(VentiladorVel == VelocidadVen.BAJA)
        VentiladorVel = VelocidadVen.ALTA;
        else
        VentiladorVel=VelocidadVen.BAJA;
    }
    public void EncenderAC(){
        AC=true;
    }
    public void ApagarAC(){
        AC=false;
    }
    public void EncenderCalefaccion(){
        Calefaccion=true;
    }
    public void ApagarCalefaccion(){
        Calefaccion=false;
    }
}
