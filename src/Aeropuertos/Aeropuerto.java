package Aeropuertos;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    public String _id;
    public boolean activo;
    public String balance;
    public String imagen;
    public int capacidad;
    public String nombre;
    public List<Etiqueta> listaEtiqueta;
    public List<Avion> aviones;
    public Aeropuerto() {
    }

    public Aeropuerto(String _id, boolean activo, String balance, String imagen, int capacidad, String nombre) {
        this._id = _id;
        this.activo = activo;
        this.balance = balance;
        this.imagen = imagen;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.listaEtiqueta = new ArrayList<>();
        this.aviones = new ArrayList<>();
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Etiqueta> getListaEtiqueta() {
        return listaEtiqueta;
    }

    public void setListaEtiqueta(List<Etiqueta> listaEtiqueta) {
        this.listaEtiqueta = listaEtiqueta;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "_id='" + _id + '\'' +
                ", activo=" + activo +
                ", balance='" + balance + '\'' +
                ", imagen='" + imagen + '\'' +
                ", capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", listaEtiqueta=" + listaEtiqueta +
                ", aviones=" + aviones +
                '}';
    }
}
