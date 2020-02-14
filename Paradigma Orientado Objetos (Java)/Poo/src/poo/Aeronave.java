package poo;
/**
 *
 * @author Luis Balam
 */
public class Aeronave extends Transporte {
    //Atributos
    String numSerie;
    int numPasajeros;

    //Constructor
    public Aeronave(String modelo, String marca, int anio, String numSerie, int numPasajeros) {
        super(modelo, marca, anio);
        this.numSerie = numSerie;
        this.numPasajeros = numPasajeros;
    }

    //Getter's y Setter's
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
}
