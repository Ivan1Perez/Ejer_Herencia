package Ejer5;

public class CocheEmpresa {

    private String matricula;
    private String marca;
    private String modelo;

    public CocheEmpresa(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "CocheEmpresa{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
