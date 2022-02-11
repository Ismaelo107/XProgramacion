/*3) Leer por teclado una serie de 10 números enteros e introducirlos en un array al que llamareis numArray.
De ese array, imprimir uno tras otro los números que sean pares.
        (2 puntos)*/

package Tema3.Examen1ªEVA.src.Ejercicio3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
        int num=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introducir número: ");
            num = sc.nextInt();
            numeros [i]= num;
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i]%2==0){
                System.out.println(numeros[i]);
            }

        }



    }
}
