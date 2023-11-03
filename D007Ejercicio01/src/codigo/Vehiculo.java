package codigo;

public abstract class Vehiculo {

    //Atributos
    private String id;
    private String placa;
    private String marca;
    private String modelo;
    private int anyo;
    private double costo;

    //Constructor
    //Constructor null
    public Vehiculo() {
    }

    //Constructor con atributos
    public Vehiculo(String id, String placa, String marca, String modelo, int anyo, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.costo = costo;
    }

    //Getters

    public String getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public double getCosto() {
        return costo;
    }


    //Métodos sin implementar
    public abstract void antiguedadVehiculo();

}
