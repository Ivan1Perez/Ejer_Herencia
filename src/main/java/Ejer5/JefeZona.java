package Ejer5;

public class JefeZona extends Empleado {

    private Secretario secretarioACargo;
    private String[] vendedoresACargo;
    private CocheEmpresa cocheEmpresa;
//    private final double incremSalario = 0.20;

    public JefeZona(String nombre, String apellido, String DNI, String direccion, int antiguedad, int telefono, float salario) {
        super(nombre, apellido, DNI, direccion, antiguedad, telefono, salario);
    }

    public void setSecretarioACargo(Secretario secretarioACargo) {
        this.secretarioACargo = secretarioACargo;
    }

    public void setCocheEmpresa(CocheEmpresa cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public void altaVendedoresACargo(String[] vendedoresACargo) {
        this.vendedoresACargo = vendedoresACargo;
    }

    public void bajaVendedoresACargo(String[] vendedoresACargo) {
        this.vendedoresACargo = vendedoresACargo;
    }

    @Override
    public void incremSalario() {

    }
}
