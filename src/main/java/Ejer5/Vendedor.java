package Ejer5;

import java.util.Arrays;

public class Vendedor extends Empleado{

    private CocheEmpresa cocheEmpresa;
    private int telefonoMovil;
    private AreaVentas areaVentas;
    private String[] listaClientes;
    private final float comisionVentas = (float) 0.025;

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

    public void darBaja(String cliente){
        boolean encontrado = false;
        int i = 0, k = 0;
        String[] aux = new String[listaClientes.length-1];
        while(i < listaClientes.length && !encontrado){
            if(listaClientes[i].compareToIgnoreCase(cliente)==0)
                encontrado = true;
            else i++;
        }

        if(encontrado){
            for(int j = 0; j < listaClientes.length-1 ; j++,k++){
                if(j==i){
                    aux[j] = listaClientes[++k];
                }else aux[j] = listaClientes[k];
            }
            listaClientes = aux;
        }

    }

    public void setCocheEmpresa(CocheEmpresa cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public void setAreaVentas(AreaVentas areaVentas) {
        this.areaVentas = areaVentas;
    }

    public void comisionPorVenta(){
        salario += salario*comisionVentas;
    }

    public String[] getListaClientes() {
        return listaClientes;
    }

    @Override
    public String toString() {

        if(cocheEmpresa==null)
            return super.toString() +
                    "- Puesto: Vendedor" + "\n" +
                    "- Coche de empresa: no disponible" + "\n" +
                    "- Area de ventas: " + areaVentas + "\n" +
                    "- Comisión de ventas: " + comisionVentas + "%\n" +
                    "- Clientes: " + Arrays.toString(listaClientes);

        return super.toString() +
                "- Puesto: Vendedor" + "\n" +
                cocheEmpresa + "\n" +
                "- Area de ventas: " + areaVentas + "\n" +
                "- Comisión de ventas: " + comisionVentas + "%\n" +
                "- Clientes: " + Arrays.toString(listaClientes);
    }
}
