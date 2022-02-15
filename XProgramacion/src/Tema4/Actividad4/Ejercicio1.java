package Tema4.Actividad4;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            int ran = random.nextInt(10);
            list.add(ran);
        }
        System.out.println(list);

        for (int i = 0; i < 100; i++) {
            list.remove(Integer.valueOf(5));
        }
        System.out.println(list);



    }

}

