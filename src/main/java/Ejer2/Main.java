package Ejer2;

import Ejer1.Formato;

public class Main {

    public static void main(String[] args) {

        Actor a1 = new Actor("Pepe Gómez");
        Actriz az1 = new Actriz("Ramona Bargas");
        Pelicula p1 = new Pelicula("Spider-Man 3", "Sam Raimi", Formato.CDAUDIO, 2.19, a1);
        Pelicula p2 = new Pelicula("Ratatouille", "Brad Bird", Formato.DVD, 1.51);
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);

    }

}
