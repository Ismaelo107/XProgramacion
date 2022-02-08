
/*1) Dibuja un rectángulo de n x m elementos de lado utilizando *. Los lados del rectángulo se pedirán por
        teclado.
        Ejemplo: para el tamaño de lado n=4 y m=5, es decir, si se introduce 4 por teclado para n y 5 para m. *****
        *****
        *****
        *****
        (2 puntos)*/
package Tema3.Examen1ªEVA.src.Ejercicio1;

import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Introducir altura del rectangulo: ");
        int h = sc.nextInt();
        System.out.println("Introducir base del rectangulo: ");
        int b = sc.nextInt();
        String asteriscos = "*";

        String [][] rectangulo = new String[h][b];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                rectangulo[i][j] = asteriscos;
            }
            System.out.println();
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(rectangulo[i][j]);
            }
            System.out.println();
        }
    }
}
