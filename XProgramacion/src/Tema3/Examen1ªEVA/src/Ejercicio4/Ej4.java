/*4) Realiza una aplicación con un menú con tres opciones:
        1) Introducir 5 números.
        2) Imprimir los elementos del array cuyos valores son menores que la media del array.
        3) Salir
        La opcion 1) recogerá los números que debéis introducir en el array hasta que llegue a 5.
        La opción 2) debe imprimir todos los elementos del array cuyo valor sea menor que la media del array. La opción 3) salir de la aplicación.
        Ejemplo:array= {1, 3,5,1,2}
        La salida será: 1 , 1 , 2 dado que la media es 2,4
        (3 puntos)*/

package Tema3.Examen1ªEVA.src.Ejercicio4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] array = new double[5];
        double cont = 0;
        double media = 0;
        int i = 0;
        int menu = 0;

        while(menu != 3) {
            System.out.println("""
                     1) Introducir 5 números.
                     2) Imprimir los elementos del array cuyos valores son menores que la media del array.
                     3) Salir
                    """);
            System.out.print("Introducir opcion a elegir: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    System.out.println("Has elegido la opcion numero " + menu);
                    for (i = 0; i < array.length; i++) {
                        System.out.println("Introducir número: ");
                        int num = sc.nextInt();
                        array[i] = num;
                        cont += num;
                    }
                    System.out.println(cont);
                    media = cont / i;
                    System.out.println(media);
                    break;


                case 2:
                    System.out.println("Has elegido la opcion numero " + menu);
                        // Tenia el if delante del for y me daba constanetemente fallos de fuera de rango
                        for ( i = 0; i < array.length; i++) {
                            if (array[i] < media) {
                                System.out.println(array[i]);
                            }
                        }
                break;

                case 3:
                    System.out.println("Has elegido la opcion numero " + menu);
                    System.out.println("Ciao");
                break;
            }
        }
    }
}
