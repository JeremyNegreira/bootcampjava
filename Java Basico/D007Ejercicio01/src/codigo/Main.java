package codigo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ArrayList tipo Vehiculo
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        //Añadimos los objetos al ArrayList
        vehiculos.add(new Camioneta("S01", "2654 MHD", "Toyota", "Hilux", 2022, 25000.0, 80.0, 12.5));
        vehiculos.add(new Camioneta("S02", "6984 MJD", "Ford", "Ranger", 2021, 28000, 70.0, 13.0));
        vehiculos.add(new Auto("S03", "8956 JPH", "Tesla", "Model 3", 2020, 50000, 75.0, 300.0));
        vehiculos.add(new Auto("S04", "4165 TGF", "Nissan", "Leaf", 2023, 45000, 60.0, 250.0));
        vehiculos.add(new Moto("S05", "0123 HGF", "Honda", "CBR 600", 2021, 8000, 600, "4 tiempos"));
        vehiculos.add(new Moto("S06", "5498 KMD", "Yamaha", "MT-07", 2022, 7500.0, 689, "2 tiempos"));

        //Mostrar información generica
        for (Vehiculo lista : vehiculos) {
            System.out.println("**************");
            System.out.println("Id Vehiculo: " + lista.getId() + ", Placa: " + lista.getPlaca() + ", Marca: " + lista.getMarca() + ", Modelo: " + lista.getModelo() + ", Año: " + lista.getAnyo() + ", Coste: " + lista.getCosto()+"€.");

            //Mostrar información específica
            if (lista instanceof Auto) {
                Auto info = (Auto) lista;
                info.infoEspecifica();
            } else if (lista instanceof Camioneta) {
                Camioneta info = (Camioneta) lista;
                info.infoEspecifica();
            } else {
                Moto info = (Moto) lista;
                info.infoEspecifica();
            }

            //Mostrar info de repostaje
            if (lista instanceof Electrico) {
                Electrico repostaje = (Electrico) lista;
                repostaje.cargarEnergia();
            } else {
                Combustion repostaje = (Combustion) lista;
                repostaje.recargarCombustible();
            }

            //Mostrar antiguedad vehiculo
            lista.antiguedadVehiculo();
            System.out.println("**************\n");
            }
        }
    }











