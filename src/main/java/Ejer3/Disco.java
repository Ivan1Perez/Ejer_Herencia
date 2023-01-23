package Ejer3;

import Ejer1.Formato;
import Ejer1.Multimedia;

public class Disco extends Multimedia {

    private Genero genero;

    public Disco(String titulo, String autor, Formato formato, double duracion){
        super(titulo, autor, formato, duracion);
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){
        String salida = super.toString() + "mins\n" +
                "- Género: \t";

        if(genero==null)
            salida += "N/A";
        else salida += genero;

        return salida;
    }
}
