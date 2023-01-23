package Ejer3;

import Ejer1.Formato;

public class Main {

    public static void main(String[] args) {

        Disco d1 = new Disco("Electric Ladyland","The Jimi Hendrix Experience", Formato.MP3, 38.30);
        d1.setGenero(Genero.ROCK);
        System.out.println(d1);

    }

}
