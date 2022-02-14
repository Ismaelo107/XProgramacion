package Tema4.Actividad3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número: ");
        int i = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        while (i != -1) {
            list.add(i);
            System.out.println("Introducir otro número: ");
            i = sc.nextInt();
        }

        System.out.println("Imprimiendo lista de números: ");
        for (Integer press :
                list) {
            System.out.print(press + " ");
        }

        System.out.println();

        System.out.println("Imprimiendo números pares: ");
        for (Integer press :
                list) {
            if (press % 2 == 0) {
                System.out.print(press + " ");
            }
        }

        System.out.println();

        System.out.println("Imprimiendo número que no son múltiplos de 3 ");
        for (Integer press :
                list) {
            if (press % 3 != 0) {
                System.out.print(press + " ");
            }
        }
    }
}
