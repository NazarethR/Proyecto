/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Student
 */
public class Cuenta {
    private double Saldo;
    private int Numero;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Cuenta(double Saldo, int Numero) {
        this.Saldo = Saldo;
        this.Numero = Numero;
    }
    
  
    
}
