package Kandydat;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)
    {
        Kandydat k1 = new Kandydat("Adam",23,"średnie",2);
        Kandydat k2 = new Kandydat("Andrzej",23,"wyższe",4);
        Kandydat k3 = new Kandydat("Marek",23,"wyższe",3);
        Kandydat k4 = new Kandydat("lukasz",30,"wyższe",9);
        Kandydat k5 = new Kandydat("Marek",24,"wyższe",1);
        Kandydat k6 = new Kandydat("lukasz",24,"wyższe",3);

        ArrayList<Kandydat> grupa = new ArrayList<Kandydat>();
        grupa.add(k1);
        grupa.add(k2);
        grupa.add(k3);
        grupa.add(k4);


        System.out.println(grupa);
        grupa.sort(Comparator.naturalOrder());
        System.out.println(grupa);


    }
}
