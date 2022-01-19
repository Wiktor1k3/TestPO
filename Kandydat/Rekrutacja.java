package Kandydat;

import java.util.ArrayList;

class Rekrutacja extends Kandydat{
    public static Integer doswiadczenie;
    private ArrayList<Kandydat> lista;

    public Rekrutacja(String nazwa, Integer wiek, String wykształcony, Integer latadoświadczenia) {
        super(nazwa, wiek, wykształcony, latadoświadczenia);
    }

    public int set(){
        return doswiadczenie = 2;
    }


}
