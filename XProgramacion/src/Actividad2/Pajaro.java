package Actividad2;

public class Pajaro {

    private int id;
    private String nombre, raza, tipo;

    public Pajaro(int id, String nombre, String raza, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String imprimirPajaros(){
        return this.id +" "+ this.nombre +" "+ this.raza +" "+ this.tipo;
    }
}
