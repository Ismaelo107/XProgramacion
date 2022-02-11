package Tema3.Actividad4.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número: ");
        int num = sc.nextInt();
        int cont=1;
        int i =1;


            System.out.print("El factorial de "+num+" es: ");
        for ( i = num; i > 0; i--) {
            cont *=i;
            System.out.print("x"+i);
        }
        System.out.println( " = " + cont);



    }
}
