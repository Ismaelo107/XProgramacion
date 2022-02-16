package Tema4.Actividad4.Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numEntero = new ArrayList<>();
        List<Integer> otroNumEntero = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;

        for (int i = 0; i < 10; i++) {
            numEntero.add(i);
        }
        System.out.println("Listea de números: " + numEntero);

        for (int i = 0; i < 3; i++) {
            System.out.println("Introducir número: ");
            num = sc.nextInt();
            otroNumEntero.add(num);
        }
        numEntero.addAll(otroNumEntero);

        System.out.println("Lista de números final: " + numEntero);

        numEntero.removeAll(otroNumEntero);

        System.out.println("Lista de números final: " + numEntero);



    }
}
