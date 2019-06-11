package ar.edu.unahur.obj2;

public class Pasajero {
    private String nomnbre;
    private String apellido;
    private int edad;

    public Pasajero(String nomnbre, String apellido, int edad) {
        this.nomnbre = nomnbre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
