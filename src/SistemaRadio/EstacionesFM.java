/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author duvan
 */
public enum EstacionesFM {
    Radio947("94.7 Radio947"), Exa("102.7 Exa"), RadioDisney("101.1 Radio Disney"),
    Musical("97.5 Musical"),LaMejor("99.1 La mejor"),RadioWAO("92.3 Radio WAO"),
    BestFM("103.5 BestFM"),Sinfonola("90.3 Sinfonola"),Monumental("93.5 Monumental"),
    Besame("89.9 Besame"),Casino("98.3 Casino"),FMglobo("100.3 FMglobo"),
    Lira("88.7 Lira"),Life("89.5 life"),Fides("93.1 Fides"),
    StereoVision("98.3 Stereo Vision"),RadioCulturalPerezZeledon("88.1 Radio Cultural Perez Zeledon");
    
    private String Estacion;

    public String getEstacion() {
        return Estacion;
    }    

    private EstacionesFM(String Estacion) {
        this.Estacion = Estacion;
    }

    void setEstacionFM(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}