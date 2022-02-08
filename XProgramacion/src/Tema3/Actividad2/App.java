package Tema3.Actividad2;

public class App {
    public static void main(String[] args) {

        Pajaro pajaro1 = new Pajaro(1,"Gorrion","Gorriato","Ave");
        Pajaro pajaro2 = new Pajaro(2,"Gaviota","Gaviota","Ave");
        Pajaro pajaro3 = new Pajaro(3,"Cisne","Cisne","Ave");
        Pajaro pajaro4 = new Pajaro(4,"Pingüino","Pingüino","Ave");
        Pajaro pajaro5 = new Pajaro(5,"Pato","Pato","Ave");

        Object[] ListaPajaros= {pajaro1.imprimirPajaros(),pajaro2.imprimirPajaros(),pajaro3.imprimirPajaros(),pajaro4.imprimirPajaros(),pajaro5.imprimirPajaros()};

        for ( Object press:
            ListaPajaros) {
            System.out.println(press);
        }
    }

}
