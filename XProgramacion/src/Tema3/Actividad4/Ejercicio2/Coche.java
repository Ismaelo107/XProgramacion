package Tema3.Actividad4.Ejercicio2;

public class Coche {
    private String matrícula;
    private String marca;
    private String modelo;

    public Coche(String matrícula, String marca, String modelo) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //public static int numCoches(){
    //todo Hacer que se incremente el numero de coches
}
