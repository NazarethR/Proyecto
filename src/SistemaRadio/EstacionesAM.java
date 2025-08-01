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
    RadioSonora("700 Radio sonora"), RadioRica("640 Radio Rica"), RadioCostaRica("930 Radio Costa Rica"),
    Radio1010("1010 Radio1010"),RadioCorobici("1240 Radio Corobicí"),RadioCuCu("1200 Radio Cucu"),
    RadioVision("1280 Radio Vision"),RadioVictoria("1180 Radio Victoria"),RadioChorotega("1100 Radio Chorotega"),
    RadioLaFuenteMusical("1300 Radio La fuente Musical"),RadioGuanacaste("1380 Radio Guanacste"),RadioNicoya("1560 Radio Nicoya"),
    RadioQuepos("1600 Radio Quepos"),RadioBuenísima("1500 Radio Buenísima"),RadioLaGigante("800 Radio La Gigante"),
    RadioSanCarlos("1430 Radio San Carlos"),RadioPampa("1420 Radio Pampa"),RadioSideral("1340 Radio Sideral"),
    RadioSinai("1400 Radio Sinaí"),RadioCulturalTilaran("1580 Radio Cultural"),RadioCulturalTurrialba("1600 Radio Cultural Turrialba");

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
