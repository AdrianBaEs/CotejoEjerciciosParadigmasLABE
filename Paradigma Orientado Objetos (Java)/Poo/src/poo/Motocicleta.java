package poo;
/**
 *
 * @author Luis Balam
 */
public class Motocicleta extends Transporte {
    //Atributos
    String tipo;
    String placa;
    
    //Constructor
    public Motocicleta(String modelo, String marca, int anio, String tipo, String placa) {
        super(modelo, marca, anio);
        this.tipo = tipo;
        this.placa = placa;
    }

    //Getter's y Setter's
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
