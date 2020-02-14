package poo;
public class Transporte {
    //Atributos
    String modelo;
    String marca;
    int anio;
    
    //Constructor
    Transporte(String modelo,String marca,int anio){
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
    }
    
    //Getter's y Setter's
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
