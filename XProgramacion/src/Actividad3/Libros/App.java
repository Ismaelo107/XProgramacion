package Actividad3.Libros;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int id;
        String titulo;
        String autor;
        String editorial;

        do {
            i++;
            System.out.println("""
                    1.Instroducir libro
                    2.Imprimir libro introducido
                    3.Salir
                    """);
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Introducir id: ");
                    id = sc.nextInt();
                    System.out.println("Introducir titulo: ");
                    titulo = sc.next();
                    System.out.println("Introducir autor: ");
                    autor = sc.next();
                    System.out.println("Introducir editorial: ");
                    editorial = sc.next();

                    Libro libros[] = {new Libro(id, titulo, autor, editorial)};
                    System.out.println(libros[i].imprimirlibro());
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    break;

            }
        } while (i < 100);
    }
}
