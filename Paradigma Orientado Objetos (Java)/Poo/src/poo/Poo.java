package poo;
import java.util.Scanner;
import poo.Automovil;
import poo.Motocicleta;
import poo.Aeronave;
import poo.Barco;
public class Poo {
    public static void main(String[] args) {
        //ALUMNO: BR. LUIS ADRIAN BALAM ESPADAS, DOCENTE: M.M.M.D. JOSÉ LEONEL PECH MAY
        Scanner escribir = new Scanner(System.in);
        String modelo, marca, placa;
        int anio;
        System.out.println("Prog Lógica y Funcional U1 - Paradigma Orientado a Objetos - Registro de Transporte");
        System.out.println("SELECCIONE UNO PARA REGISTRAR:\n(1) Automóvil\n(2) Motocicleta\n(3) Aeronave\n(4) Barco");
        System.out.print("\nIndique el número: ");
        int opcion = escribir.nextInt();
        switch(opcion){
            case 1:
                System.out.println("\n--- Registro de Automóvil ---");
                System.out.println("Indique el modelo: ");
                modelo = escribir.next();
                System.out.println("Especifique la marca: ");
                marca = escribir.next();
                System.out.println("Especifique el año: ");
                anio = escribir.nextInt();
                System.out.println("Número de puertas: ");
                int numPuertas = escribir.nextInt();
                System.out.println("Indique la placa: ");
                placa = escribir.next();
                Automovil auto = new Automovil(modelo,marca,anio,placa,numPuertas);
                System.out.println("\n¡Automóvil Registrado!\nModelo: "+auto.getModelo()+"\nMarca: "+auto.getMarca()+"\nAño: "+auto.getAnio()+"\nPuertas: "+auto.getNumPuertas()+"\nPlaca: "+auto.getPlaca()+"\n");               
                break;
            case 2:
                System.out.println("\n--- Registro de Motocicleta ---");
                System.out.println("Indique el modelo: ");
                modelo = escribir.next();
                System.out.println("Especifique la marca: ");
                marca = escribir.next();
                System.out.println("Especifique el año: ");
                anio = escribir.nextInt();
                System.out.println("Indique el tipo: ");
                String tipo = escribir.next();
                System.out.println("Indique la placa: ");
                placa = escribir.next();
                Motocicleta moto = new Motocicleta(modelo,marca,anio,tipo,placa);
                System.out.println("\n¡Motocicleta Registrada!\nModelo: "+moto.getModelo()+"\nMarca: "+moto.getMarca()+"\nAño: "+moto.getAnio()+"\nTipo: "+moto.getTipo()+"\nPlaca: "+moto.getPlaca()+"\n");
                break;
            case 3:
                System.out.println("\n--- Registro de Aeronave ---");
                System.out.println("Indique el modelo: ");
                modelo = escribir.next();
                System.out.println("Especifique la marca: ");
                marca = escribir.next();
                System.out.println("Especifique el año: ");
                anio = escribir.nextInt();
                System.out.println("Número de serie: ");
                String numSerie = escribir.next();
                System.out.println("Indique número de pasajeros: ");
                int numPasajeros = escribir.nextInt();
                Aeronave aero = new Aeronave(modelo,marca,anio,numSerie,numPasajeros);
                System.out.println("\n¡Aeronave Registrada!\nModelo: "+aero.getModelo()+"\nMarca: "+aero.getMarca()+"\nAño: "+aero.getAnio()+"\nNúm. Serie: "+aero.getNumSerie()+"\nNúm. Pasajeros: "+aero.getNumPasajeros()+"\n");
                break;
            case 4:
                System.out.println("\n--- Registro de Barco ---");
                System.out.println("Indique el modelo: ");
                modelo = escribir.next();
                System.out.println("Especifique la marca: ");
                marca = escribir.next();
                System.out.println("Especifique el año: ");
                anio = escribir.nextInt();
                System.out.println("Tipo de material: ");
                String material = escribir.next();
                System.out.println("Indique el tipo de propulsión: ");
                String tipoPropulsion = escribir.next();
                Barco barco = new Barco(modelo,marca,anio,material,tipoPropulsion);
                System.out.println("\n¡Barco Registrado!\nModelo: "+barco.getModelo()+"\nMarca: "+barco.getMarca()+"\nAño: "+barco.getAnio()+"\nMaterial: "+barco.getMaterial()+"\nPropulsión: "+barco.getTipoPropulsion()+"\n");
                break;
            default:
                System.out.println("\n¡La opción "+opcion+" NO existe!. Intente de nuevo.\n");
        }
    }   
}
