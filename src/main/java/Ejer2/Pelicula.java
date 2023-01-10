package Ejer2;

import Ejer1.Formato;
import Ejer1.Multimedia;

public class Pelicula extends Multimedia {

    private Actor actorPrincipal;
    private Actor actrizPrincipal;

    public Pelicula (String titulo, String autor, Formato formato, double duracion, String actor){
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actor;
        this.actrizPrincipal = actor;
    }

    public Pelicula (String titulo, String autor, Formato formato, double duracion, String actorPrincipal, String actrizPrincipal){
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }


}
