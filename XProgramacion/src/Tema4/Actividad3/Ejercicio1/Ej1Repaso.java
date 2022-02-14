package Tema4.Actividad3.Ejercicio1;

import java.util.*;

public class Ej1Repaso {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Introducir número: ");
            list.add(num);
            num = sc.nextInt();

        } while (num != -1);

        System.out.println(list);

        for (int press :
                list) {
            if (press % 2 == 0) {
                System.out.print(press);
            }
        }

        System.out.println();

        for (int press :
                list) {
            if (press % 3 != 0) {
                System.out.print(press);
            }
        }
    }
}
