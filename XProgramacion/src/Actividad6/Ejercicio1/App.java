package Actividad6.Ejercicio1;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Socio> socios = new ArrayList<>();
        int menu;

        do {
            System.out.println("""
                    1- Alta de socio.
                    2.- Baja socio.
                    3.- Modificación de socio.
                    4.- Listado por DNI.
                    5.- Listado por antigüedad.
                    6.- Salir
                    """);

            System.out.print("Introducir opcion a selecionar: ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Introducir dni: ");
                    String dni = sc.next();
                    System.out.println("Introducir nombre: ");
                    String nombre = sc.next();
                    System.out.println("Introducir fecha: ");
                    String fecha = sc.next();

                    socios.add(new Socio(dni, nombre, fecha));

                    for (Socio print :
                            socios) {
                        System.out.println(print);
                    }

                    break;

                case 2:
                    System.out.println("Eliminar socio");
                    dni = sc.next();

                    Iterator<Socio> it = socios.iterator();
                    while (it.hasNext()) {
                        if (it.next().getDni().equals(dni)) {
                            it.remove();
                        }
                    }

                    for (Socio press : socios) {
                        System.out.println(press);
                    }
                    break;

                case 3:

                    break;

            }
        } while (menu != 6);
    }
}

