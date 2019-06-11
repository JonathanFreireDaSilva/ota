package ar.edu.unahur.obj2;

import java.util.Random;

public class DistribuidorDeTrafico {

    private Random random = new Random();

    public String proveedor() {
        switch (random.nextInt(9)) {
            case 0:
            case 1:
            case 2: return "Amadeus";
            case 3:
            case 4:
            case 5: return "Sabre";
            case 6:
            case 7:
            case 8: return "Worldspan";
            default: return "Amadeus";
        }

    }
}
