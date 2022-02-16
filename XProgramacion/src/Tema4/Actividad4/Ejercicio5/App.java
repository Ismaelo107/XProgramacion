package Tema4.Actividad4.Ejercicio5;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Alumno alumno;
        alumnos.add(new Alumno("09212586R", "Ismael", "Ouardane", "C/Aro,nº25"));
        alumnos.add(new Alumno("09212586R", "Ivan", "Rodrigez", "C/Velez,nº25"));
        alumnos.add(new Alumno("09223486D", "Joaquin", "Cerro", "C/Damian,nº5"));
        alumnos.add(new Alumno("09267586H", "Juana", "Cortés", "C/Tellez,nº12"));
        alumnos.add(new Alumno("56220586E", "Cintia", "Felicidad", "C/Lafuete,19"));
        alumnos.add(new Alumno("09276586T", "Daniel", "Gómez", "C/Castuo,34"));

        for (Alumno listAlumnos :
                alumnos) {
            System.out.println(listAlumnos.getDni() + " " + listAlumnos.getNombre() + " " + listAlumnos.getApellido() + " " + listAlumnos.getDir());
        }

        System.out.println("""
                1.- Buscar alumno por nombre. Debe encontrar todos los alumnos cuyo nombre contenga el nombre proporcionado.
                2.- Busca los alumnos que empiecen por parte del nombre introducido por teclado. Es decir, si introduzco “An” me sacará todos los Antonio, Antonia, Anselmo, Ana....
                3.- Extraer el primer apellido del alumno cuyo nombre se proporcione por teclado.
                4.- Obtener tamaño de los apellidos. Para un nombre dado buscar en el arrayList si existe y dar el tamaño de los apellidos.
                5.- Remplazar nombres. Reemplaza todos los nombre que aparezcan como Jordi por Jorge.
                """);
        System.out.println("Introducir opcion: ");
        int menu = sc.nextInt();
        switch (menu) {

            case 1:
                System.out.println("Introducir nombre: ");
                String nombre = sc.next();
                Iterator<Alumno> it = alumnos.iterator();
                while (it.hasNext()) {
                    alumno = it.next();
                    if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("Alumno encontrado: ");
                        System.out.println(alumno.toString());
                    }
                }
                break;

            case 2:
                System.out.println("Introducir contenido del nombre: ");
                nombre = sc.next();
                Iterator<Alumno> it2 = alumnos.iterator();
                while (it2.hasNext()) {
                    alumno = it2.next();
                    if (alumno.getNombre().contains(nombre)) {
                        System.out.println("Alumno encontrado: ");
                        System.out.println(alumno.toString());
                    }
                }
                break;
            case 3:
                System.out.println("Introducir nombre: ");
                nombre = sc.next();
                Iterator<Alumno> it3 = alumnos.iterator();
                while (it3.hasNext()) {
                    alumno = it3.next();
                    if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("Alumno encontrado: ");
                        System.out.println(alumno.getApellido());
                    }
                }
                break;
            case 4:
                System.out.println("Introducir nombre: ");
                nombre = sc.next();
                Iterator<Alumno> it4 = alumnos.iterator();
                while (it4.hasNext()) {
                    alumno = it4.next();
                    if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("Alumno encontrado: ");
                        System.out.println("El apellido tiene " + alumno.getApellido().length() + " letras");
                    }
                }
                break;
            case 5:
                System.out.println("Introducir nombre: ");
                nombre = sc.next();
                Iterator<Alumno> it5 = alumnos.iterator();
                while (it5.hasNext()) {
                    alumno = it5.next();
                    if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("Alumno encontrado: ");
                        System.out.println("Cambiar nombre a: ");
                        alumno.setNombre(sc.next());
                        System.out.println(alumno);
                    }
                }
                break;
        }

    }
}
