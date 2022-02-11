package Tema3.Actividad1;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Instroducir datos de la primare persona: ");
        System.out.println("Introducir Id: ");
        int id = sc.nextInt();
        System.out.println("Introducir DNI: ");
        int dni = sc.nextInt();
        System.out.println("Introducir NOMBRE: ");
        String nombre = sc.next();
        System.out.println("Introducir DIRECCION: ");
        String direccion = sc.next();
        System.out.println("Introducir TELEFONO: ");
        int telefono = sc.nextInt();

        Persona p1 = new Persona(id, dni, nombre, direccion, telefono);

        System.out.println("Introducir datos de la segunda persona: ");
        System.out.println("Introducir Id: ");
        id = sc.nextInt();
        System.out.println("Introducir DNI: ");
        dni = sc.nextInt();
        System.out.println("Introducir NOMBRE: ");
        nombre = sc.next();
        System.out.println("Introducir DIRECCION: ");
        direccion = sc.next();
        System.out.println("Introducir TELEFONO: ");
        telefono = sc.nextInt();

        Persona p2 = new Persona(id, dni, nombre, direccion, telefono);

        System.out.println(p1.pressPersona());
        System.out.println(p2.pressPersona());
    }
}
