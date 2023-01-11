package Ejer2;

import Ejer1.Formato;
import Ejer1.Multimedia;

public class Pelicula extends Multimedia {


    protected Actor actor;
    protected Actriz actriz;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, Actor actor){
        super(titulo, autor, formato, duracion);
        this.actor = actor;

    }

    public Pelicula(String titulo, String autor, Formato formato, double duracion, Actriz actriz){
        super(titulo, autor, formato, duracion);
        this.actriz = actriz;

    }

    public Pelicula (String titulo, String autor, Formato formato, double duracion){
        super(titulo, autor, formato, duracion);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
