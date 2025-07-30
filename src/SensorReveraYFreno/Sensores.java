/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SensorReveraYFreno;

/**
 *
 * @author duvan
 */
public class Sensores {
    private boolean frenoMano;
    private boolean ObstaculoSen;

    public boolean isFrenoMano() {
        return frenoMano;
    }

    public void setFrenoMano(boolean frenoMano) {
        this.frenoMano = frenoMano;
    }

    public boolean isObstaculoSen() {
        return ObstaculoSen;
    }

    public void setObstaculoSen(boolean ObstaculoSen) {
        this.ObstaculoSen = ObstaculoSen;
    }

    public Sensores() {
        this.frenoMano = true;
        this.ObstaculoSen = false;
    }
    
    public void aldetectarobstaculo(){
        ObstaculoSen=true;
    }
    
    public void nodetectarobstaculo(){
        ObstaculoSen=false;
    }
    
    public void desactivarFreno(){
        frenoMano=false;
    }
    public void activarFreno(){
        frenoMano=true;
    }
}
