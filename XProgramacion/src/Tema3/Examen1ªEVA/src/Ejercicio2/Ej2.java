//2) Realiza una aplicación java que muestre las tablas de multiplicar del 1 al 10. (2 puntos)

package Tema3.Examen1ªEVA.src.Ejercicio2;

public class Ej2 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println();
            System.out.println("Tabla del " + i+": ");

            for (int j = 0; j < 11; j++) {
                int sol = i * j;
                System.out.println(i + " x " + j + " = " + sol);
            }
        }
    }
}
