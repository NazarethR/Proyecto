/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaEncendido;

/**
 *
 * @author danny
 */
public class Motor {

    private boolean on;

    public Motor() {
        this.on = false;

    }

    public void motorEncendido() {
        on = true;

    }
      public void motorApagado() {
        on = false;

    } 
    
      public boolean estaEncendido() {
          return on;
      }
      
      

}

