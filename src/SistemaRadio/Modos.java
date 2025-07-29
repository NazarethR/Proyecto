/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author duvan
 */
public enum Modos {
    AM("AM"),FM("FM"),BLUETOOTH("Bluetooth");
    
    private String elmodo;

    public String getElmodo() {
        return elmodo;
    }

    private Modos(String elmodo) {
        this.elmodo = elmodo;
    }

    void setmodo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
    
    
}
