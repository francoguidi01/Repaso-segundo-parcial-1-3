package Aeropuertos;

public class Avion {
    private int id;
    private String piloto;
    private int capacidadPasajeros;

    public Avion() {
    }

    public Avion(int id, String piloto, int capacidadPasajeros) {
        this.id = id;
        this.piloto = piloto;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "id=" + id +
                ", piloto='" + piloto + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}
