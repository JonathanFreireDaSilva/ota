package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Proveedor;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class ProveedorWorldspan implements Proveedor {
    Worldspan worldspan = new Worldspan();

    @Override
    public List<Vuelo> buscarVuelo(DateTime fecha, String origen, String destino) {
        return worldspan.searchFlights(fecha.getDayOfMonth(), fecha.getMonthOfYear(), fecha.getYear(), origen, destino);
    }

    public Boleto Comprar(Vuelo vuelvo, Set<Pasajero> pasajeros) {
        return worldspan.bookFlight(vuelvo, pasajeros);
    }
}
