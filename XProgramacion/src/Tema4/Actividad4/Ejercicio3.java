package Tema4.Actividad4;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<Integer> listP = new ArrayList<>();
        List<Integer> listI = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 1;

        do  {
            System.out.println("Introducir número del 1-10: ");
            num = sc.nextInt();
            list.add(num);
            if(num%2 == 0){
                listP.add(num);
            } else{
                listI.add(num);
            }


            System.out.println("Listea de números: "+list);
            System.out.println("Listea de números pares: "+listP);
            System.out.println("Listea de números impares: "+listI);

        }while ( i != 0);
    }
}
