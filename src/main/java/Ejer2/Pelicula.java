package Ejer2;

import Ejer1.Formato;
import Ejer1.Multimedia;

public class Pelicula extends Multimedia {


    protected Actor actor;
    private final String animacion = "Animación";
    protected Actriz actriz;

    public Pelicula(String titulo, String autor, Formato formato, double duracion){
        super(titulo, autor, formato, duracion);
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActriz(Actriz actriz) {
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        String salida = "";

        salida +=  super.toString()+"h";

        if(actor != null){
            salida += "\n- Actor: \t" + actor;
        }else if(actriz!=null)
            salida += "\n- Actriz: \t" +actriz;
        else salida += "\n- " + animacion;
        return salida;
    }
}
