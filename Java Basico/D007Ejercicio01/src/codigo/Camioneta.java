package codigo;

public class Camioneta extends Vehiculo implements Combustion{

    //Atributos
    private double capacidadTanque;
    private double consumoCombustible;

    //Constructor
    public Camioneta(String id, String placa, String marca, String modelo, int anyo, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anyo, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    //Métodos
    @Override
    public void recargarCombustible() {
        System.out.println("Esta cargando combustible...");
    }

    public void infoEspecifica(){
        System.out.println("Tiene una capacidad de capacidad del tanque de: " + capacidadTanque +" l. y un consumo de: "+ consumoCombustible + "litros");
    }

    @Override
    public void antiguedadVehiculo() {
        int anyoActual = 2023;
        System.out.println("La antigüedad de este vehiculo es de: " + (anyoActual-getAnyo()) + " años");
    }


}


