package Ejer2;

import Ejer1.Formato;

public class Main {

    public static void main(String[] args) {

        Actor a1 = new Actor("Pepe Gómez");
        Actriz az1 = new Actriz("Ramona Bargas");
        Pelicula p1 = new Pelicula("Spider-Man 3", "Sam Raimi", Formato.CDAUDIO, 2.19);
        p1.setActriz(az1);
        Pelicula p2 = new Pelicula("Ratatouille", "Brad Bird", Formato.DVD, 1.51);
        p2.setActor(a1);
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        Pelicula p3 = new Pelicula("Superman", "Manolo Perez", Formato.AVI, 2.10);
        System.out.println(p3);

    }

}
