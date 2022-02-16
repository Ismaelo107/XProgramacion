package Tema4.Actividad4.Ejercicio5;

import java.util.Objects;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private String dir;

    public Alumno(String dni, String nombre, String apellido, String dir) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dir = dir;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }




    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}
