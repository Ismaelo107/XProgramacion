package Tema3.Examen1ªEVA.src.Ejercicio4;

import java.util.Scanner;

public class Ej4Prof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un número: ");
        int num = sc.nextInt();
        int[] array = new int[5];
        double suma = 0;
        double media = suma / 5;



        switch (num) {
            case (1):
                for (int i = 0; i < 5; i++) {
                    System.out.println("Introducir un número: ");
                    int num2 = sc.nextInt();
                    array[i] = num2;
                }
                for (int j = 0; j < 5; j++) {
                    System.out.println(array[j]);
                    suma = suma + array[j];
                }

                break;

            case (2):
                //System.out.println(media);
                for (int j = 0; j < 5; j++) {
                    System.out.println(array[j]);
                    suma = suma + array[j];
                }
                break;

            case (3):
                System.out.println("Adios");
                break;
        }


    }
}
