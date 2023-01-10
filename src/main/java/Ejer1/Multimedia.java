package Ejer1;

public class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private double duracion;

    public Multimedia(String titulo, String autor, Formato formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Multimedia){
            Multimedia m = (Multimedia) obj;
            return m.titulo.equalsIgnoreCase(titulo) && m.autor.equalsIgnoreCase(autor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", duracion=" + duracion +
                '}';
    }
}
