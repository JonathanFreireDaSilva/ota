package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.ProveedorAmadeus;
import ar.edu.unahur.obj2.proveedores.ProveedorSabre;
import ar.edu.unahur.obj2.proveedores.ProveedorWorldspan;

import java.util.Random;

public class DistribuidorDeTrafico {

    private Random random = new Random();
    Proveedor prov;

    public Proveedor proveedor() {
        switch (random.nextInt(9)) {
            case 0:
            case 1:
            case 2: return prov = new ProveedorAmadeus();
            case 3:
            case 4:
            case 5: return prov = new ProveedorSabre();
            case 6:
            case 7:
            case 8: return prov = new ProveedorWorldspan();
            default: return prov = new ProveedorAmadeus();
        }

    }
}
