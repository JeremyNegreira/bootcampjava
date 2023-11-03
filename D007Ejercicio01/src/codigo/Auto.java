package codigo;

public class Auto extends Vehiculo implements Electrico{

    //Atributos
    private double capacidadBateria;
    private double autonomia;

    //Constructor
    public Auto(String id, String placa, String marca, String modelo, int anyo, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anyo, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    //Métodos
    @Override
    public void cargarEnergia() {
        System.out.println("Esta cargando electricidad...");
    }

    public void infoEspecifica(){
        System.out.println("Tiene una capacidad de bateria de: " + capacidadBateria +"mah y una autonomia de: "+ autonomia + "hs");
    }

    @Override
    public void antiguedadVehiculo() {
        int anyoActual = 2023;
        System.out.println("La antigüedad de este vehiculo es de: " + (anyoActual-getAnyo()) + " años");
    }
}

