package poo;
/**
 *
 * @author Luis Balam
 */
public class Automovil extends Transporte {
    //Atributos
    String placa;
    int numPuertas;

    //Constructor
    public Automovil(String modelo, String marca, int anio, String placa, int numPuertas) {
        super(modelo, marca, anio);
        this.placa = placa;
        this.numPuertas = numPuertas;
    }
    
    //Getter's y Setter's
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }   
}
