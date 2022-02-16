package Tema4.Actividad4.Ejercicio3;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> listP = new ArrayList<>();
        List<Integer> listI = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Introducir número del 1-10: ");
        int num = sc.nextInt();
        while ( num != 0) {
            System.out.println("Introducir número del 1-10: ");
            list.add(num);
            if(num%2 == 0){
                listP.add(num);
            } else{
                listI.add(num);
            }
            num = sc.nextInt();
        }


        System.out.println("Listea de números: "+list);
        System.out.println("Listea de números pares: "+listP);
        System.out.println("Listea de números impares: "+listI);
    }
}
