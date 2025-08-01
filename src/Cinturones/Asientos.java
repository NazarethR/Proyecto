/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinturones;

/**
 *
 * @author nazar
 */
public class Asientos {
    private Cinturon Conductor;
    private Cinturon Copiloto;
    private Cinturon Pasajero1;
    private Cinturon Pasagero2;

    public Cinturon getConductor() {
        return Conductor;
    }

    public void setConductor(Cinturon Conductor) {
        this.Conductor = Conductor;
    }

    public Cinturon getCopiloto() {
        return Copiloto;
    }

    public void setCopiloto(Cinturon Copiloto) {
        this.Copiloto = Copiloto;
    }

    public Cinturon getPasajero1() {
        return Pasajero1;
    }

    public void setPasajero1(Cinturon Pasajero1) {
        this.Pasajero1 = Pasajero1;
    }

    public Cinturon getPasagero2() {
        return Pasagero2;
    }

    public void setPasagero2(Cinturon Pasagero2) {
        this.Pasagero2 = Pasagero2;
    }

    public Asientos() {
        this.Conductor = new Cinturon();
        this.Copiloto = new Cinturon();
        this.Pasajero1 =  new Cinturon();
        this.Pasagero2 =  new Cinturon();
    }

   public void abrochar(Cinturon e){
       e.setEstado( true);
   }
     public void desabrochar(Cinturon e){
       e.setEstado( false);
   }
    
}
