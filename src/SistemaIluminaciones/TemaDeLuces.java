/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaIluminaciones;

import java.awt.Color;

/**
 *
 * @author danny
 */
public enum TemaDeLuces {

    APAGADO(Color.DARK_GRAY), LUCESBAJAS(Color.YELLOW), LUCESALTAS(Color.WHITE),INTERMITENTES(Color.ORANGE),DIRECCIONALES_IZQUIERDA(Color.GREEN),DIRECCIONALES_DERECHA(Color.GREEN),
    LUCES_FRENO(Color.RED);
 
    
    private Color luces;

    public Color getLuces() {
        return luces;
    }

    private TemaDeLuces(Color luces) {
        this.luces = luces;
    }



}
