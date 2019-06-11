package ar.edu.unahur.obj2;


import java.util.Set;

public class Boleto {

    private final Vuelo vuelo;
    private final Set<Pasajero> pasajeros;

    public Boleto(Vuelo vuelo, Set<Pasajero> pasajeros) {
        this.vuelo = vuelo;
        this.pasajeros = pasajeros;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Set<Pasajero> getPasajeros() {
        return pasajeros;
    }
}
