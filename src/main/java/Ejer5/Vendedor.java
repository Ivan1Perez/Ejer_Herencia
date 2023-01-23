package Ejer5;

import java.util.Arrays;

public class Vendedor extends Empleado{

    private CocheEmpresa cocheEmpresa;
    private int telefonoMovil;
    private AreaVentas areaVentas;
    private String[] listaClientes;
    private float comisionVentas;
//    private final double incremSalario = 0.10;

    public Vendedor(String nombre, String apellido, String DNI, String direccion, int antiguedad, int telefono, float salario, int telefonoMovil) {
        super(nombre, apellido, DNI, direccion, antiguedad, telefono, salario);
        this.telefonoMovil = telefonoMovil;
        this.listaClientes = new String[0];
    }

    @Override
    public void incremSalario() {
        salario += salario*0.1;
    }

    public void darAlta(String cliente){
        String[] aux = new String[listaClientes.length+1];


        for(int i = 0 ; i < listaClientes.length ; i++)
            aux[i] = listaClientes[i];

        aux[aux.length-1] = cliente;


        listaClientes = aux;
    }

//    public void darBaja(String cliente){
//        boolean encontrado = false;
//        int i = 0;
//        while(i < listaClientes.length() && !encontrado){
//            if(listaClientes[i].compareToIgnoreCase(cliente)==0)
//                encontrado = true;
//            else i++;
//        }
//    }

    public void setCocheEmpresa(CocheEmpresa cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public void setAreaVentas(AreaVentas areaVentas) {
        this.areaVentas = areaVentas;
    }

    public String[] getListaClientes() {
        return listaClientes;
    }

    @Override
    public String toString() {

        return super.toString() +
                "cocheEmpresa=" + cocheEmpresa +
                ", areaVentas=" + areaVentas +
                ", comisionVentas=" + comisionVentas +
                ", salario=" + salario + "\n" +
                "Clientes: " + Arrays.toString(listaClientes) + "\n" +
                "Puesto: Vendedor";
    }
}
