package Exepcion;

import Aeropuertos.Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class CapacidadAeropuertoException extends Exception {
    //De la lista anterior de aeropuertos generar otra lista pasando los aeropuertos
    //cuya capacidad sea mayor a una enviada por parámetro. Cuando la capacidad sea
    //menor o igual a la enviada, lanzar una excepción custom almacenando la capacidad
    //del aeropuerto.
    public int capacidad;

    public CapacidadAeropuertoException(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public static List<Aeropuerto> filtro(List<Aeropuerto> aeropuertos, int capacidadMinima) throws CapacidadAeropuertoException {
        List<Aeropuerto> filtrados = new ArrayList<>();

        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCapacidad() > capacidadMinima) {
                filtrados.add(aeropuerto);
            } else {
                throw new CapacidadAeropuertoException(aeropuerto.getCapacidad());
            }
        }
        return filtrados;
    }
}
