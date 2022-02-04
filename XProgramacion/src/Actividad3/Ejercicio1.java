package Actividad3;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introuducir un numero: ");
        int num = sc.nextInt();

        int contador = -1;

            for (int i = 0; i <= num; i++) {
                contador += 2;
                for (int j = 0; j < i; j++) {
                    System.out.print(contador);
                }
                System.out.println(" ");
            }
    }
}
