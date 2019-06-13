package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public interface Proveedor{

List<Vuelo>  buscarVuelo(DateTime fecha, String origen, String destino);

Boleto Comprar(Vuelo vuelvo, Set<Pasajero> pasajeros);
}
