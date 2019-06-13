package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Proveedor;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class ProveedorSabre implements Proveedor {
    Sabre sabre = new Sabre();
    @Override
    public List<Vuelo> buscarVuelo(DateTime fecha, String origen, String destino) {
        return sabre.buscar(fecha, origen, destino);
    }

    public Boleto Comprar(Vuelo vuelvo, Set<Pasajero> pasajeros) {
        return sabre.comprar(vuelvo, pasajeros);
    }
}
