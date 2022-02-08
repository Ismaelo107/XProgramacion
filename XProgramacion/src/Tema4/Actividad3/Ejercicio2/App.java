package Tema4.Actividad3.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Libro> list = new ArrayList<>();

        Libro libro = new Libro();


        boolean exit = false;
        int id;
        int i = 0;
        String titulo, autor, editorial;

        while (!exit) {
            System.out.println("""
                    1- Introducir libro.
                    2.- Imprimir libros almacenados
                    3.- Buscar libro por id. (realizar tres versiones de este apartado recorriendo con for, forecha y con iterator)
                    4.- Salir.
                    """);
            System.out.print("Introducir opción a elegir: ");
            int menu = sc.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("Introducir libros: ");
                    System.out.println("Introducir id: ");
                    id = sc.nextInt();
                    System.out.println("Introducir Título: ");
                    titulo = sc.next();
                    System.out.println("Introducir Autor:");
                    autor = sc.next();
                    System.out.println("Introducir Editorial:");
                    editorial = sc.next();
                    list.add(new Libro(id, titulo, autor, editorial));
                    break;
                case 2:
                    System.out.println("Imprimir libros introducidos: ");
                    for (Libro press :
                            list) {
                        System.out.println(press.getId() + " " + press.getTitulo() + " " + press.getAutor() + " " + press.getEditorial());

                    }
                    break;

                case 3:
                    id = sc.nextInt();

                    if (id == libro.getId()) {
                        for (Libro press :
                                list) {
                            System.out.println(press.getId() + " " + press.getTitulo() + " " + press.getAutor() + " " + press.getEditorial());

                        }
                    }

                    break;

                case 4:
                    exit = true;
                    break;
            }
            System.out.println();
        }
    }
}