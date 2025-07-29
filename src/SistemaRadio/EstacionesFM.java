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
    Radio947("94.7"), Exa("102.7 "), RadioDisney("101.1"),
    Musical("97.5 "),LaMejor("99.1 "),RadioWAO("92.3 "),
    BestFM("103.5"),Sinfonola("90.3 "),Monumental("93.5 "),
    Besame("89.9 "),Casino("98.3 "),FMglobo("100.3"),
    Lira("88.7"),Life("89.5 "),Fides("93.1"),
    StereoVision("98.3"),RadioCulturalPerezZeledon("88.1");
    
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