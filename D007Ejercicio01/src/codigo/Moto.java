package codigo;

public class Moto extends Vehiculo implements Combustion{

    //Atributos
    private int cilindrada;
    private String tipoMotor;

    //Constructor
    public Moto(String id, String placa, String marca, String modelo, int anyo, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anyo, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    //Métodos
    @Override
    public void recargarCombustible() {
        System.out.println("Esta cargando combustible...");
    }

    public void infoEspecifica(){
        System.out.println("Tiene una cilidadrada de: " + cilindrada +"cc y su motor de: "+ tipoMotor);
    }

    public void antiguedadVehiculo() {
        int anyoActual = 2023;
        System.out.println("La antigüedad de este vehiculo es de: " + (anyoActual-getAnyo()) + " años");
    }
}


