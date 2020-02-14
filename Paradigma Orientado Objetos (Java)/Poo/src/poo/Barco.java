package poo;
/**
 *
 * @author Luis Balam
 */
public class Barco extends Transporte {
    //Atributos
    String material;
    String tipoPropulsion;
    
    //Constructor
    public Barco(String modelo, String marca, int anio, String material, String tipoPropulsion) {
        super(modelo, marca, anio);
        this.material = material;
        this.tipoPropulsion = tipoPropulsion;
    }

    //Getter's y Setter's
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }
}
