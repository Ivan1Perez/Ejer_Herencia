package Ejer5;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private int telefono;
    protected float salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellido, String DNI, String direccion, int antiguedad, int telefono, float salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public abstract void incremSalario();


    @Override
    public String toString() {
        return "Empleado{" + "\n" +
                "- Nombre: " + nombre + "\n" +
                "- Apellido: " + apellido + "\n" +
                "- DNI: " + DNI + "\n" +
                "- Direccion: " + direccion + "\n" +
                "- Antiguedad: " + antiguedad + "\n" +
                "- Telefono: " + telefono + "\n" +
                "- Salario: " + String.format("%.2f",salario) + "€\n" +
                "- Supervisor: " + supervisor + "\n";
    }
}
