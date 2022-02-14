package Tema4.Actividad3.Ejercicio2;

import java.util.*;

public class App2 {
    public static void main(String[] args) {

        List<Libro> libros = new ArrayList<>(100);
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu != 5) {

            System.out.println("""
                    1- Introducir libro.
                    2.- Imprimir libros almacenados
                    3.- Buscar libro por id. (realizar tres versiones de este apartado recorriendo con for, forecha y con iterator)
                    4.- Baja o eliminación (elimina un libro de la lista proporcionándole el id).    
                    5.- Salir.    
                    """);
            System.out.println("Introducir opción a seleccionar: ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Has seleccionado la primera opción");

                    System.out.println("Introducir Id: ");
                    int id = sc.nextInt();
                    System.out.println("Introducir Título: ");
                    String titulo = sc.next();
                    System.out.println("Introducir Autor: ");
                    String autor = sc.next();
                    System.out.println("Introducir Editorial: ");
                    String editorial = sc.next();

                    libros.add(new Libro(id, titulo, autor, editorial));
                    break;

                case 2:
                    System.out.println("Has seleccionado la segunda opción");

                    for (Libro imprimirLibros :
                            libros) {
                        System.out.println(imprimirLibros.toString());
                    }
                    break;

                case 3:
                    System.out.println("Has seleccionado la tercera opción");
                    while (menu != 4) {
                        System.out.println("Seleccionar opcion del submenu");
                        System.out.println("""
                                1-Por id
                                2- Por titulo
                                3- Por autor.
                                4- Volver al menú anterior
                                """);
                        menu = sc.nextInt();

                        switch (menu) {
                            case 1:
                                System.out.println("Has selecionado busqueda por Id");
                                System.out.println("Introducir Id de libro a buscar:");
                                int findId = sc.nextInt();
                                Libro libro;
                                for (int i = 0; i < libros.size(); i++) {
                                    libro = libros.get(i);
                                    if (findId == libro.getId()) {
                                        System.out.println("Libro encontrado");
                                        System.out.println(libro);
                                    } else {
                                        System.out.println("Libro no encontrado.");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Has selecionado busqueda por Titulo");
                                System.out.println("Introducir Titulo de libro a buscar:");
                                String findTitulo = sc.next();
                                Libro libro1;
                                for (int i = 0; i < libros.size(); i++) {
                                    libro1 = libros.get(i);
                                    if (findTitulo.equals(libro1.getTitulo())) {
                                        System.out.println("Libro encontrado");
                                        System.out.println(libro1);
                                    } else {
                                        System.out.println("Libro no encontrado.");
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Has selecionado busqueda por Autor");

                                System.out.println("Introducir Autor de libro a buscar:");
                                String findAutor = sc.next();
                                Libro libro2;
                                for (int i = 0; i < libros.size(); i++) {
                                    libro2 = libros.get(i);
                                    if (findAutor.equals(libro2.getAutor())) {
                                        System.out.println("Libro encontrado");
                                        System.out.println(libro2);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Vas a volver al menú anterior");
                        }
                    }
                    break;

                case 4:
                    Libro libro;
                    System.out.println("Introducir Id del libro a Eliminar");
                    int findId = sc.nextInt();
                    for (int i = 0; i < libros.size(); i++) {
                        libro = libros.get(i);

                        if (findId == libro.getId()) {
                            libros.remove(libro);
                            System.out.println("Libro " + libro.getTitulo() + " con ID " + libro.getId() + " ha sido eliminado");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Has selecionado la opcion de salir " + "\n" + "Chao :( ");
                    break;
            }
        }
    }
}