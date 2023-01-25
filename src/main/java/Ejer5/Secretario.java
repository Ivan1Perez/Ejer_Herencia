package Ejer5;

public class Secretario extends Empleado{

    private int despacho;
    private int fax;
    private float incremSalario = (float) 0.05;

    public Secretario(String nombre, String apellido, String DNI, String direccion, int antiguedad, int telefono, float salario, int despacho, int fax) {
        super(nombre, apellido, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void incremSalario() {
        salario += salario*0.05;
    }

    @Override
    public String toString() {
        return super.toString() +
                "- Puesto: Secretario" + "\n" +
                "- Despacho: " + despacho + "\n" +
                "- Fax: " + fax;
    }
}
