package ar.edu.unahur.obj2;


import org.joda.time.DateTime;

import java.util.Objects;

public class Vuelo {

    private final String origen;
    private final DateTime fecha;
    private final String destino;
    private final String numero;
    private int lugaresDisponibles;
    private final String proveedor;

    public Vuelo(DateTime fecha, String origen, String destino, String numero, int lugaresDisponibles, String proveedor) {
        this.origen = origen;
        this.fecha = fecha;
        this.destino = destino;
        this.numero = numero;
        this.lugaresDisponibles = lugaresDisponibles;
        this.proveedor = proveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return getFecha().equals(vuelo.getFecha()) &&
                getNumero().equals(vuelo.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFecha(), getNumero());
    }

    public void venderLugares(int cantidad) {
        lugaresDisponibles -= cantidad;
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public DateTime getFecha() {
        return fecha;
    }

    public String getDestino() {
        return destino;
    }

    public int getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public String getProveedor() {
        return proveedor;
    }
}
