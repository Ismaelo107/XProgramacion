package Tema4.Actividad4.Ejercicio2;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < 100; i++) {
            int random = ran.nextInt(10);
            list.add(random);
        }
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer remove = it.next();
            if(remove.equals(5)){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
