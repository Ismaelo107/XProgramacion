package Tema4.Actividad3.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args){

        List<Integer> numeros= new ArrayList<>();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero:");
        Integer num=teclado.nextInt();
        while(num!=-1){
            numeros.add(num);
            System.out.println("Introduce otro número: ");
            num=teclado.nextInt();
        }

        // mostrando los numeros
        System.out.println("Imprimiendo números: ");
        for (Integer i: numeros
        ) {
            System.out.println(i);
        }

        // mostrando los pares
        System.out.println("Imprimiendo números pares: ");
        for (Integer i: numeros
        ) {
            if (i%2==0) {               // comprueba si es par
                System.out.println(i);
            }
        }


        // Con iterator

        Iterator<Integer> it=numeros.iterator();
        while(it.hasNext()){                // comprueba si quedan mas elementos
            if ( it.next() % 3 == 0){       // devuelve el proximo elemento y lo divide entre 3 obteniendo el resto y comprobando que sea 0
                it.remove();                // elimina el elemento proporcionado por el next, es decir, el actualmente apuntado.
            }
        }

        System.out.println("Imprimendo los numeros que no son divisibles por 3");
        for (Integer i: numeros
        ) {
            System.out.println(i);
        }
    }
}
