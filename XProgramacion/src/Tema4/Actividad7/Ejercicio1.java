package Tema4.Actividad7;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        Map<String, Double> alumnos = new HashMap<>();

        // Añadir 4 alumnos
        alumnos.put("Pepe", 1.80);
        alumnos.put("Juana", 1.70);
        alumnos.put("Elisa", 1.81);
        alumnos.put("Luis", 1.70);

        Collection<Double> valor = alumnos.values();
        Double cont = 0.0;

        // Alumno con mayor altura.
        for (Double al :
                valor) {
            if (al > cont) {
                cont = al;
            }
        }
        System.out.println("La altura más grande es " + cont);

        // Imprimir Clave y valor.
        Set<Map.Entry<String, Double>> alVa = alumnos.entrySet();

        for (Map.Entry<String, Double> al :
                alVa) {
            System.out.println("El alumno " + al.getKey() + " tiene una estatura de: " + al.getValue());
        }

        // Imprimir clave
        Set<String> clave = alumnos.keySet();
        for (String cl :
                clave) {
            System.out.println(cl);
        }

        //Imprimir valor
        for (Double al :
                valor) {
            System.out.println(al);
        }
    }
}

