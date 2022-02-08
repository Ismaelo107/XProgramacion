package Tema3.Actividad4.Ejercicio5;
//A) Realiza un programa que pida una cadena por teclado y luego muestre un menú como el siguiente, realizando las operaciones oportunas:


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir Cadena: ");
        String cadena = sc.next();
        String cadena2;
        System.out.println("""
                1.- Convierte a mayúsculas la cadena introducida .
                2.- Convierte a minúsculas la cadena introducida.
                3.- Convierte a CamelCase.
                4.- Compara si es igual otra cadena que se solicite por teclado.
                5.- Compara si es alfabeticamente menor que otra cadena que solicite por teclado.
                6.- Indica si está contenido en otra cadena que se solicite por teclado.
                                
                Introducir opcion a elegir:
                                
                """);
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println(cadena.toUpperCase());
                break;

            case 2:
                System.out.println(cadena.toLowerCase());
                break;
            case 3:

                break;
            case 4:
                System.out.println("Introducir otra cadena: ");
                cadena2 = sc.next();
                if (cadena.equals(cadena2)) {
                    System.out.println("Las dos cadenas son iguales");
                } else {
                    System.out.println("Las dos cadenas no son iguales");
                }
                break;
            case 5:
                System.out.println("Introducir otra cadena: ");
                cadena2 = sc.next();
                int comparador = cadena.compareTo(cadena2);
                if (comparador == 0) {
                    System.out.println("La primer cadena es igual que la segunda");
                } else if (comparador > 0) {
                    System.out.println("La primer cadena es mayor que la segunda");
                } else {
                    // Si resultado < 0
                    System.out.println("La primer cadena es menor que la segunda");
                }
                break;

            case 6:
                System.out.println("Introducir otra cadena: ");
                cadena2 = sc.next();
                if (cadena.contains(cadena2) == true) {
                    System.out.println("La cadena" + cadena + " si contiene a la cadena " + cadena2);
                } else {
                    System.out.println("La cadena " + cadena + " no contiene a la cadena " + cadena2);
                }
                break;
        }

    }
}
