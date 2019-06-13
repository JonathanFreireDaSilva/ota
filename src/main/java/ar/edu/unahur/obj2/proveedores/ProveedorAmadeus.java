package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Proveedor;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class ProveedorAmadeus implements Proveedor {

 Amadeus ama = new Amadeus();

    @Override
    public List<Vuelo> buscarVuelo(DateTime fecha, String origen, String destino) {
        return ama.executeSearch(fecha, origen,destino );
    }

    @Override
    public Boleto Comprar(Vuelo vuelvo, Set<Pasajero> pasajeros) {
        return ama.executeBook(vuelvo, pasajeros);
    }
}
