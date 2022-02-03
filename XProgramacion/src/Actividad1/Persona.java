package Actividad1;

public class Persona {
    private int id, dni, telefono;
    private String nombre, dir;

    public Persona(int id, int dni, String nombre, String dir, int telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.dir = dir;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void telefono(int telefono) {
        this.telefono = telefono;
    }

    public String pressPersona() {
        return "Con id " + this.id + ",dni " + this.dni + ", nombre " + this.nombre + ",direccion " + this.dir + "y teléfono " + this.telefono +
                ".";
    }
}
