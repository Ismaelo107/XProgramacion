package Actividad1;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        Persona p1 = new Persona(id,dni,nombre,direccion,telefono);

        System.out.println(p1.pressPersona());
    }
}
