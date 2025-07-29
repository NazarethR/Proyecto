/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author duvan
 */
public enum EstacionesAM {
    RadioSonora("700"), RadioRica("640"), RadioCostaRica("930"),
    Radio1010("1010"),RadioCorobici("1240"),RadioCuCu("1200"),
    RadioVision("1280"),RadioVictoria("1180"),RadioChorotega("1100"),
    RadioLaFuenteMusical("1300"),RadioGuanacaste("1380"),RadioNicoya("1560"),
    RadioQuepos("1600"),RadioBuenísima("1500"),RadioLaGigante("800"),
    RadioSanCarlos("1430"),RadioPampa("1420"),RadioSideral("1340"),
    RadioSinai("1400"),RadioCulturalTilaran("1580"),RadioCulturalTurrialba("1600");

    private String Estacion;

    public String getEstacion() {
        return Estacion;
    }

    private EstacionesAM(String Estacion) {
        this.Estacion = Estacion;
    }

    void setEstacionAM(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
