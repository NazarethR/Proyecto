/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDePuertas;

/**
 *
 * @author danny
 */
public class Puertas {

    private boolean puertasAbiertas[];

    public Puertas() {
        this.puertasAbiertas = new boolean[4];
    }

    public void abierta(int vec) {
        if (vecValido(vec)) {
            puertasAbiertas[vec] = true;
        }
    }

    public void cerrada(int vec) {
        if (vecValido(vec)) {
            puertasAbiertas[vec] = false;
        }
    }

    public boolean laPuertaEstaAbierta(int vec) {
        return vecValido(vec) && puertasAbiertas[vec];

    }

// con esta parte estoy devolviendo el estado de todas las puertas en una forma de texto 
    public String estadoDeTodasLasPuertas() {
        StringBuilder sb = new StringBuilder("Estado de las puertas:\n");
        for (int i = 0; i < puertasAbiertas.length; i++) {
            sb.append("  Puerta ").append(i + 1)
                    .append(": ").append(puertasAbiertas[i] ? "ABIERTA" : "CERRADA").append("\n");
        }
        return sb.toString();
    }

    private boolean vecValido(int vec) {
        return vec >= 0 && vec < puertasAbiertas.length;
    }

    //El append este es parte de la clase StringBuilder / este me sirve para agregar texto al final de la cadena existente de mejor forma 
    //StringBuilder me  permite construir cadenas de texto sin crear nuevas instancias en cada paso, y el método
    // .append()   /  este lo estoy usando para  q el me vaya agregando partes 
}
